package net.fluxcapdata.codelibrary.search;

import java.util.List;

public interface Search {

    public <T extends Comparable> T searchObject(List<T> list, T obj);

}
