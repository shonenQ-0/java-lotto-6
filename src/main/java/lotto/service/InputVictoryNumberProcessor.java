package lotto.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InputVictoryNumberProcessor {
    List<Integer> victoryNumbers;

    public List<Integer> getVictoryNumbers() {
        return victoryNumbers;
    }

    public InputVictoryNumberProcessor(String input) {
        String[] split = input.split(",");
        validate(split);
        victoryNumbers = new ArrayList<>();
        stringArrayToIntegerList(split);
    }

    private void stringArrayToIntegerList(String[] split) {
        for (String s : split) {
            victoryNumbers.add(Integer.parseInt(s));
        }
    }

    private void validate(String[] split) {
        validateType(split);
        validateSize(split);
        validateRange(split);
        validateDuplicate(split);
    }

    private void validateDuplicate(String[] split) {
        HashSet<String> duplicates = new HashSet<>(Arrays.asList(split));
        if (duplicates.size() != split.length) {
            throw new IllegalArgumentException("[ERROR] : 당첨 번호는 중복되어선 안됩니다.");
        }
    }

    private void validateType(String[] split) {
        try {
            for (String s : split) {
                Integer.parseInt(s);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] : 당첨 번호는 양수를 입력해주세요.");
        }
    }

    private void validateRange(String[] split) {
        for (String s : split) {
            if (!s.matches("[0-9]+")) {
                throw new IllegalArgumentException("[ERROR] : 당첨 번호는 양수를 입력해주세요.");
            }
        }
    }

    private void validateSize(String[] split) {
        if (split.length != 6) {
            throw new IllegalArgumentException("[ERROR] : 6개의 당첨번호를 입력해주세요");
        }
    }
}
