package net.fluxcapdata.codelibrary.search;

import java.util.List;

public class BinarySearch implements Search {
    @Override
    public <T extends Comparable> T searchObject(List<T> list, T obj) {
        int start=0;
        int end=list.size()-1;
        while (start <= end) {
            int middle = start + (end-start)/2;
            int compared = list.get(middle).compareTo(obj);
            if (compared == 0) {
                return list.get(middle);
            } else if (compared < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return null;
    }

}
