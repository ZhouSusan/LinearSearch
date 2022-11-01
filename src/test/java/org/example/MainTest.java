package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void search() {

       int[] testCaseOne = {3, 1, 3, 2, 6, 9, 7, 6};
       int[] testCaseTwo = {10};
       int[] testCaseThree = {103, -110};
       int[] testCaseFour = {22, 22, 22, 22};

        assertAll(() -> assertEquals(4, Main.search(6, testCaseOne)),
                () -> assertEquals(0, Main.search(10, testCaseTwo)),
                () -> assertEquals(-1, Main.search(10, testCaseThree)),
                () -> assertEquals(0, Main.search(22, testCaseFour)));
    }
}