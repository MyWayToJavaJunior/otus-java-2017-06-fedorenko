package com.otus.hw14.benchmark;

import java.util.Arrays;

public class NativeSorter implements BenchmarkSorter {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
