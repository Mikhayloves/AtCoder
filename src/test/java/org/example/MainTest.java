package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testBasicCase() {
        String input = "4\n1 3\n3 1\n4 4\n7 1";
        String result = Main.solve(input);
        assertEquals("3", result);
    }
}