package net.fluxcapdata.codelibrary.sort;

public interface Sort {
    public <T extends Comparable> void sort(T[] data);
}
