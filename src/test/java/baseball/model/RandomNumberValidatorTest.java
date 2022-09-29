package baseball.model;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RandomNumberValidatorTest extends NsTest {

    @Test
    void allValidateTest() {
        System.out.println(new RandomNumberValidator().allValidate("123"));
        System.out.println(new RandomNumberValidator().allValidate("234"));
        System.out.println(new RandomNumberValidator().allValidate("964"));
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}