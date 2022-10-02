package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {

    private List list;

    public RandomNumbers() {
        list = makeList(new ArrayList<>());

        System.out.println(list);
    }

    private List makeList(List list) {
        int randomNumber = Randoms.pickNumberInRange(1,9);

        if (!isDuplicate(list, randomNumber)) {
            list.add(randomNumber);
        }
        if (list.size() < 3) {
            makeList(list);
        }

        return list;
    }

    private boolean isDuplicate(List list, int randomNumber) {
        return list.contains(randomNumber);
    }


    public boolean isEqual(int index, int value) {
        return list.indexOf(value) == index;
    }

    public boolean contains(int target) {
        return list.contains(target);
    }

}
