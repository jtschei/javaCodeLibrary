package net.fluxcapdata.codelibrary.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestMergeSort {

    @Test
    void MergeSortTest1() {
        Integer[] expected = new Integer[1000];
        Integer[] sorted = new Integer[1000];
        for (int i=0; i<sorted.length; i++) {
            expected[i] = i;
            sorted[i] = i;
        }

        Sort sorter = new MergeSort();
        sorter.sort(sorted);

        Assertions.assertArrayEquals(expected, sorted);
    }

    @Test
    void MergeSortTest2() {
        Integer[] expected = new Integer[1000];
        Integer[] sorted = new Integer[1000];
        for (int i=0; i<sorted.length; i++) {
            expected[i] = i;
        }
        for (int i=expected.length-1,j=0; i>=0; i--,j++) {
            sorted[j] = expected[i];
        }

        Sort sorter = new MergeSort();
        sorter.sort(sorted);

        Assertions.assertArrayEquals(expected, sorted);
    }

    @Test
    void MergeSortTest3() {
        Integer[] expected = new Integer[1000];
        Integer[] sorted = new Integer[1000];
        for (int i=0; i<sorted.length; i++) {
            expected[i] = i;
            sorted[i] = i;
        }

        Random random = new Random();
        int i=0;
        while (i < 1000) {
            int a = random.nextInt(1000);
            int b = random.nextInt(1000);
            if (a!=b) {
                int t = sorted[a];
                sorted[a] = sorted[b];
                sorted[b] = t;
            }
            i++;
        }

        Sort sorter = new MergeSort();
        sorter.sort(sorted);

        Assertions.assertArrayEquals(expected, sorted);
    }
}