package lotto.service;

public class InputMoneyProcessor {
    private final int buyCount;

    public InputMoneyProcessor(String inputMoney) {
        try {
            Integer.parseInt(inputMoney);
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] : 구입 금액은 숫자를 입력해주세요.");
        }
        int money = Integer.parseInt(inputMoney);
        validateMoney(money);
        this.buyCount = findCount(money);
    }

    private int findCount(int money) {
        return money / 1000;
    }

    private void validateMoney(int money) {
        validateMoneyUnit(money);
        validateMoneyRange(money);
    }

    private void validateMoneyRange(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException("[ERROR] : 양수를 입력해주세요.");
        }
    }

    private void validateMoneyUnit(int money) {
        if (money % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] : 구입 금액은 1,000원 단위입니다.");
        }
    }

    public int getBuyCount() {
        return buyCount;
    }
}
