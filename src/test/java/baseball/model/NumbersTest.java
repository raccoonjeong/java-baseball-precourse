package baseball.model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class NumbersTest {

    @Test
    @DisplayName("길이 테스트")
    void badLengthTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Numbers("12345");
        });
    }

    @Test
    @DisplayName("형식 테스트")
    void badFormatTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Numbers("1zz");
        });
    }

    @Test
    @DisplayName("중복 테스트")
    void duplicateTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Numbers("112");
        });
    }

}