package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class LottoManager {
    private final Integer LOW_NUM = 1;
    private final Integer HIGH_NUM = 45;
    private final Integer TRY_COUNT = 6;
    private LinkedHashMap<Integer, List<Integer>> storage;

    public LottoManager() {
        storage = new LinkedHashMap<>();
    }

    public List<Integer> createNumber(int i) {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(LOW_NUM, HIGH_NUM, TRY_COUNT);
        Collections.sort(numbers);
        storage.put(i, numbers);
        return numbers;
    }
}
