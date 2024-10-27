package lotto.service;

public class InputBonusNumberProcessor {
    private Integer bonusNumber;

    public InputBonusNumberProcessor(String bonusNumber) {
        try {
            Integer.parseInt(bonusNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] : 구입 금액은 숫자를 입력해주세요.");
        }
        int bonus = Integer.parseInt(bonusNumber);
        validate(bonus);
    }

    private void validate(int bonus) {
        if (bonus < 1 || bonus > 45) {

        }
    }
}
