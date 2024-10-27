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

    public String readVictoryNumber() {
        String readVictoryNumber = Console.readLine();
        if (readVictoryNumber.isBlank()) {
            throw new IllegalArgumentException("[ERROR] : 당첨 번호가 입력 되지 않았습니다.");
        }
        return readVictoryNumber;
    }
}
