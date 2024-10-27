package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readMoney() {
        String readMoney = Console.readLine();
        if (readMoney.isBlank()) {
            throw new IllegalArgumentException("[ERROR] : 금액이 입력되지 않았습니다.");
        }
        return readMoney;
    }
}
