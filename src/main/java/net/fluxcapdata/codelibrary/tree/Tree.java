package net.fluxcapdata.codelibrary.tree;

public interface Tree<T extends Comparable<T>> {

    void add(T value);
    T get(T value);

}