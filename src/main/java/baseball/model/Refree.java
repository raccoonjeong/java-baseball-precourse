package baseball.model;

import java.util.List;

public class Refree {

    private int strikeCount;
    private int ballCount;

    public ResultDTO gesture(List answer, List input) {

        for (int i = 0; i < 3; i++) {
            int value = (int)input.get(i);

            boolean isStrike = isEqual(answer, i, value);

            strikeCount = isStrike ? strikeCount + 1 : strikeCount;
            ballCount = (!isStrike && answer.contains(value)) ? ballCount + 1 : ballCount;
        }

        return new ResultDTO(strikeCount, ballCount);
    }

    public boolean isEqual(List list, int index, int value) {
        return list.indexOf(value) == index;
    }

}
