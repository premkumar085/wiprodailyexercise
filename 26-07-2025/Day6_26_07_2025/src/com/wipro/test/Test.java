package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Test {

    @ParameterizedTest
    @ValueSource(strings = {"prem", "vijay", "afroj"})
    void checkAllLowerCase(String str) {
        assertTrue(str.equals(str.toLowerCase()));
    }
}
