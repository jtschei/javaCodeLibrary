package net.fluxcapdata.codelibrary.sort;

public class QuickSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] data) {
        doSort(data,0,data.length-1);
    }

    private <T extends Comparable> void doSort(T[] data, int start, int end) {
        if (start < end) {
            int partition = doPartition(data, start, end);
            doSort(data,start,partition-1);
            doSort(data,partition+1, end);
        }
    }

    private <T extends Comparable> int doPartition(T[] data, int start, int end) {
        T pivot = data[end];
        int i = start-1;
        for (int j=start; j<=end; j++) {
            if (data[j].compareTo(pivot) < 0) {
                i++;
                swap(data,i,j);
            }
        }
        swap(data,i+1,end);
        return i+1;
    }

    private <T extends Comparable> void swap(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
