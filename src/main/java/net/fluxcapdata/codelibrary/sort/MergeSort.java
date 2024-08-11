package net.fluxcapdata.codelibrary.sort;

import java.util.Arrays;

public class MergeSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] data) {
        doSort(data,0,data.length-1);
    }

    private <T extends Comparable> void doSort(T[] data, int start, int end) {
        if (start < end) {
            int mid = start + (end-start)/2;
            doSort(data, start, mid);
            doSort(data, mid+1, end);
            doMerge(data, start, mid, end);
        }
    }

    private <T extends Comparable> void doMerge(T[] data, int start, int mid, int end) {
        T[] left = Arrays.copyOfRange(data, start, mid+1);
        T[] right = Arrays.copyOfRange(data, mid+1, end+1);

        int i=start;
        int lidx=0;
        int ridx=0;
        while (lidx < left.length && ridx < right.length) {
            if (left[lidx].compareTo(right[ridx]) <= 0) {
                data[i] = left[lidx];
                i++;
                lidx++;
            } else {
                data[i] = right[ridx];
                i++;
                ridx++;
            }
        }
        while (lidx < left.length) {
            data[i] = left[lidx];
            i++;
            lidx++;
        }
        while (ridx < right.length) {
            data[i] = right[ridx];
            i++;
            ridx++;
        }
    }

}
