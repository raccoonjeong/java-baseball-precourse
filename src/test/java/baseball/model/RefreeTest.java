package baseball.model;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RefreeTest extends NsTest {
    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    @Test
    public void gestureTest() {
        int[] param1 = {1,2,3};
        String[] param2 = {"1","3","5"};
        System.out.println(new Refree().gesture(param1, param2));
    }

}