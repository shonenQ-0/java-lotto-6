package lotto.controller;

import lotto.service.InputMoneyProcesser;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private OutputView outputView;
    private InputView inputView;
    private InputMoneyProcesser moneyProcesser;

    public LottoController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void run() {
        outputView.printStartMessage();
        moneyProcesser = new InputMoneyProcesser(inputView.readMoney());
        System.out.println(moneyProcesser.getBuyCount());
    }

}
