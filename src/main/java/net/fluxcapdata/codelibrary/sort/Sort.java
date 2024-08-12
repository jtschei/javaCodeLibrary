package net.fluxcapdata.codelibrary.sort;

public interface Sort {
    <T extends Comparable<T>> void sort(T[] data);
}
