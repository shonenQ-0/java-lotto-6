package lotto.view;

import java.util.List;

public class OutputView {

    public void printStartMessage() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printBuyCount(int buyCount) {
        System.out.println();
        System.out.println(buyCount + "개를 구매했습니다.");
    }

    public void printLottoNumber(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public void printWinnerNumber() {
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
    }
}
