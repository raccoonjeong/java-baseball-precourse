package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;

public class RandomNumberMaker {

    public int[] makeTargetNumber() {
        int[] targets = new int[3];

        RandomNumberValidator validator = new RandomNumberValidator();

        int index = 0;
        while(index < 3) {
            targets[index] = Randoms.pickNumberInRange(1,9);
            index = validator.singlyValidate(targets, index);
        }

        System.out.println(Arrays.toString(targets));
        return targets;
    }
}
