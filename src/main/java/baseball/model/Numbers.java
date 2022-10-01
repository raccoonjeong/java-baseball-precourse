package baseball.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Numbers {

    private List<Integer> list = new ArrayList<>();

    public Numbers(String str) {
        validate(str);
        for (int i = 0; i < 3; i++) {
            list.add(Integer.valueOf(String.valueOf(str.charAt(i))));
        }
    }

    public List getList() {
        return list;
    }

    private void validate(String str) {
        if (str.length() != 3) {
            throw new IllegalArgumentException("길이가 3이 아님");
        }

        if (!str.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new IllegalArgumentException("숫자가 아님");
        }

        String[] strs = str.split("");
        Set set = new HashSet();

        for (int i = 0; i < 3; i++) {
            set.add(Integer.valueOf(strs[i]));
        }

        if (set.size() < 3) {
            throw new IllegalArgumentException("중복된 숫자가 있음");
        }

    }

}
