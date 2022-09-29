package baseball.model;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class RandomNumberMakerTest extends NsTest {
    @Test
    void makeTargetNumberTest() {
        new RandomNumberMaker().makeTargetNumber();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}