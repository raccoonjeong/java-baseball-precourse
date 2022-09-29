package baseball.model;

public class Refree {


    public String gesture(int[] targets, String[] inputs) {

        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (targets[i] == Integer.valueOf(inputs[j])) {
                    if (i == j) {
                        strikeCount++;
                    } else {
                        ballCount++;
                    }
                }
            }
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
}
