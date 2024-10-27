package lotto.controller;

import java.util.List;
import lotto.service.InputProcesser;
import lotto.service.LottoManager;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private OutputView outputView;
    private InputView inputView;
    private InputProcesser moneyProcesser;
    private LottoManager ticketManager;

    public LottoController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.ticketManager = new LottoManager();
    }

    public void run() {
        outputView.printStartMessage();
        moneyProcesser = new InputProcesser(inputView.readMoney());
        int buyCount = moneyProcesser.getBuyCount();
        outputView.printBuyCount(buyCount);
        createLotto(buyCount);
    }

    private void createLotto(int buyCount) {
        for (int i = 0; i < buyCount; i++) {
            List<Integer> numbers = ticketManager.createNumber();
            outputView.printLottoNumber(numbers);
        }
    }


}
