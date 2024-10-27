package lotto.controller;

import lotto.view.OutputView;

public class LottoController {
    private OutputView outputView;

    public LottoController() {
        this.outputView = new OutputView();
    }

    public void run() {
        outputView.printStartMessage();
    }

}
