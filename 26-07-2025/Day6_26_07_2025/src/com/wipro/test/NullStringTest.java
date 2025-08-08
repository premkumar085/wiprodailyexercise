package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NullStringTest {

    @Test
    void nullString() {
        String str = null;
        assertThrows(NullPointerException.class, () -> {
            str.toUpperCase();
        });
    }
}
