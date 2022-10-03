package baseball.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RefreeTest {

    Refree refree;

    @BeforeEach
    void before() {
        refree = new Refree();
    }

    @Test
    void 볼테스트() {

        List answer = Arrays.asList(1,2,3);
        List input = Arrays.asList(2,4,5);

        ResultDTO result = refree.gesture(answer, input);
        assertEquals("1볼", result.getResult());
    }

    @Test
    void 볼스트라이크테스트() {
        List answer = Arrays.asList(1,2,3);
        List input = Arrays.asList(1,3,4);

        ResultDTO result = refree.gesture(answer, input);
        assertEquals("1볼 1스트라이크", result.getResult());
    }

    @Test
    void 스트라이크테스트() {
        List answer = Arrays.asList(1,2,3);
        List input = Arrays.asList(1,2,3);

        ResultDTO result = refree.gesture(answer, input);
        assertEquals("3스트라이크", result.getResult());
    }

    @Test
    void 낫싱테스트() {
        List answer = Arrays.asList(1,2,3);
        List input = Arrays.asList(4,5,6);

        ResultDTO result = refree.gesture(answer, input);
        assertEquals("낫싱", result.getResult());
    }
}