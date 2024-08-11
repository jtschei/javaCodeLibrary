package net.fluxcapdata.codelibrary.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBinarySearch {

    @Test
    public void TestBinarySearch1() {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<10000; i+=2) {
            list.add(i);
        }

        Search search = new BinarySearch();
        Assertions.assertEquals(100,search.searchObject(list,100));
        Assertions.assertNull(search.searchObject(list,51));

    }
}
