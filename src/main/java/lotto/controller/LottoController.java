package lotto.controller;

import java.util.List;
import lotto.domain.Lotto;
import lotto.service.InputMoneyProcessor;
import lotto.service.InputVictoryNumberProcessor;
import lotto.service.LottoManager;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private OutputView outputView;
    private InputView inputView;
    private InputMoneyProcessor moneyProcessor;
    private InputVictoryNumberProcessor victoryNumberProcessor;
    private LottoManager lottoManager;
    private Lotto lotto;

    public LottoController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.lottoManager = new LottoManager();
    }

    public void run() {
        outputView.printStartMessage();
        moneyProcessor = new InputMoneyProcessor(inputView.readMoney());
        int buyCount = moneyProcessor.getBuyCount();
        outputView.printBuyCount(buyCount);
        createLotto(buyCount);
        outputView.printWinnerNumber();
        String victoryNumber = inputView.readVictoryNumber();
        victoryNumberProcessor = new InputVictoryNumberProcessor(victoryNumber);
        outputView.printBonusNumber();
    }

    private void createLotto(int buyCount) {
        for (int i = 0; i < buyCount; i++) {
            List<Integer> numbers = lottoManager.createNumber(i);
            outputView.printLottoNumber(numbers);
        }
    }


}
