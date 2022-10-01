package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbers {

    private List list;

    public RandomNumbers() {
        Set set = new HashSet<>();

        int setSize = 0;
        while(set.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1,9);
            set.add(randomNumber);
        }

        list = new ArrayList(set);
        System.out.println(list);
    }

    public List getList() {
        return list;
    }

    public boolean isEqual(int index, int value) {
        return list.indexOf(value) == index;
    }

    public boolean contains(int target) {
        return list.contains(target);
    }

}
