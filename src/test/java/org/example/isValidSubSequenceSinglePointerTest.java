package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class isValidSubSequenceSinglePointerTest {
    @Test
    void test1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test2() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test3() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 6, -1, 8, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test4() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(22, 25, 6);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test5() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test6() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test7() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, -1, 8, 10);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test8() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = List.of(25);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test9() {
        var array = Arrays.asList(1, 1, 1, 1, 1);
        var sequence = Arrays.asList(1, 1, 1);
        assertTrue(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test10() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test11() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test12() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test13() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test14() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test15() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, -1);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test16() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, -1, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test17() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, -2);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test18() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = List.of(26);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test19() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 25, 22, 6, -1, 8, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test20() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 26, 22, 8);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test21() {
        var array = Arrays.asList(1, 1, 6, 1);
        var sequence = Arrays.asList(1, 1, 1, 6);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test22() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10, 11, 11, 11, 11);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test23() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 10);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }

    @Test
    void test24() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 5);
        assertFalse(Main.isValidSubsequenceSinglePointer(array, sequence));
    }
}