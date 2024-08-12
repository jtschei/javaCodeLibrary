package net.fluxcapdata.codelibrary.search;

import java.util.List;

public interface Search {

    <T extends Comparable<T>> T searchObject(List<T> list, T obj);

}
