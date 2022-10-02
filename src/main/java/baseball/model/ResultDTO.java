package baseball.model;


import org.junit.platform.commons.util.StringUtils;

public class ResultDTO {

    private String result;
    private int strikeCount;
    private int ballCount;

    public ResultDTO(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.result = "";
    }

    private void countStrike() {
        if (strikeCount > 0) {
            result += (strikeCount + "스트라이크");
        }
    }

    private void countBall() {
        if (ballCount > 0) {
            result += (ballCount + "볼");
        }
    }

    public String getResult() {
        countStrike();
        countBall();

        if (StringUtils.isBlank(result)) {
            result = "낫싱";
        }

        return result;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
