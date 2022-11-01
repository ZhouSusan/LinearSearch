package org.example;

import java.util.Objects;

public class Main {
    public static int search(int n, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (Objects.equals(list[i], n)) {
                return i;
            }
        }
        return -1;
    }
}