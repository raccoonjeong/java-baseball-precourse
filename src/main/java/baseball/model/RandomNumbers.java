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

    List makeList(List list) {
        int randomNumber = Randoms.pickNumberInRange(1,9);

        if (!isDuplicate(list, randomNumber)) {
            list.add(randomNumber);
        }
        if (list.size() < 3) {
            makeList(list);
        }

        return list;
    }

    boolean isDuplicate(List list, int randomNumber) {
        return list.contains(randomNumber);
    }

    public List getList() {
        return this.list;
    }

}
