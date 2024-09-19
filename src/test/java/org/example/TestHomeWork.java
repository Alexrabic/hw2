package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestHomeWork {

    @Test
    void test_findMaxDigits() {
        HomeWork tree = new HomeWork();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        List<Integer> maxDigits = tree.findMaxDigits(3, 4);
        assertEquals(Arrays.asList(4, 3, 2), maxDigits);
    }

    @Test
    void test_findMaxDigitsHard() {
        HomeWork tree = new HomeWork();
        tree.add(540);
        tree.add(284);
        tree.add(45);
        tree.add(100023);
        tree.add(483);
        tree.add(221);
        tree.add(784);
        tree.add(321);

        List<Integer> maxDigits = tree.findMaxDigits(3, 500);
        assertEquals(Arrays.asList(483, 321, 284), maxDigits);
        assertThrows(IllegalArgumentException.class, () -> tree.findMaxDigits(0, 4));
        assertThrows(IllegalArgumentException.class, () -> tree.findMaxDigits(4, 0));
    }
}
