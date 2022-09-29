package baseball.model;

import java.util.HashSet;

public class RandomNumberValidator {

    public int singlyValidate(int[] targets, int index) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <= index; i++) {
            set.add(targets[i]);
        }

        if (set.size() == (index + 1)) {
            return ++index;
        }

        return --index;
    }

    public boolean allValidate(String str) {

        if (str.length() != 3) {
            throw new IllegalArgumentException("길이가 3이 아님");
        }

        if (!str.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new IllegalArgumentException("숫자가 아님");
        }

        String[] strs = str.split("");
        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < 3; i++) {
            set.add(Integer.valueOf(strs[i]));
        }

        if (set.size() < 3) {
            throw new IllegalArgumentException("중복된 숫자가 있음");
        }

        return true;
    }

}
