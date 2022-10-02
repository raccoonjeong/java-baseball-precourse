package baseball.model;

import java.util.Arrays;
import java.util.List;

public class Refree {

    private int strikeCount;
    private int ballCount;
    public ResultDTO gesture(RandomNumbers answer, Numbers input) {

        List inputList = input.getList();

        for (int i = 0; i < 3; i++) {
            int value = (int)inputList.get(i);
            strikeCount = answer.isEqual(i, value) ? strikeCount + 1 : strikeCount;
            ballCount = (!answer.isEqual(i, value) && answer.contains(value)) ? ballCount + 1 : ballCount;
        }

        return new ResultDTO(strikeCount, ballCount);

    }
}
