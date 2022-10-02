package baseball;

import baseball.controller.BaseballController;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        controller.initializeGame();
    }
}
