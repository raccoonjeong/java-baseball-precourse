package baseball.model;

import java.util.Arrays;
import java.util.List;

public class Refree {
    public String gesture(RandomNumbers answer, Numbers input) {
        int strikeCount = 0;
        int ballCount = 0;

        List inputList = input.getList();

        for (int i = 0; i < 3; i++) {
            int value = (int)inputList.get(i);
            strikeCount = answer.isEqual(i, value) ? strikeCount + 1 : strikeCount;
            ballCount = (!answer.isEqual(i, value) && answer.contains(value)) ? ballCount + 1 : ballCount;
        }

        StringBuffer result = new StringBuffer();

        if (strikeCount > 0) {
            result.append(strikeCount + "스트라이크");
        }

        if (ballCount > 0) {
            result.append(ballCount + "볼");
        }

        if (strikeCount == 0 && ballCount == 0) {
            result.append("낫싱");
        }

        return result.toString();

    }
//    public String gesture(int[] targets, String[] inputs) {
//
//        int strikeCount = 0;
//        int ballCount = 0;
//
//        // 456
//        // 234
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (targets[i] == Integer.valueOf(inputs[j])) {
//                    if (i == j) {
//                        strikeCount++;
//                    } else {
//                        ballCount++;
//                    }
//                }
//            }
//        }
//
//        StringBuffer result = new StringBuffer();
//        if (strikeCount > 0) {
//            result.append(strikeCount + "스트라이크");
//        }
//        if (ballCount > 0) {
//            result.append(ballCount + "볼");
//        }
//        if (strikeCount == 0 && ballCount == 0) {
//            result.append("낫싱");
//        }
//
//        return result.toString();
//    }
}
