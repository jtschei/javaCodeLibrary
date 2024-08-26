package net.fluxcapdata.codelibrary.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestBinarySearchTree {

    @Test
    public void testBinarySearchTree1() {
        Random random = new Random();
        BinarySearchTree<Integer> b = new BinarySearchTree<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<1000; i++) {
            int r = random.nextInt();
            list.add(r);
            b.add(r);
        }

        Collections.sort(list);
        List<Integer> blist1 = b.getInOrder();
        Assertions.assertArrayEquals(list.toArray(), blist1.toArray());

        list.sort(Collections.reverseOrder());
        List<Integer> blist2 = b.getInReverseOrder();
        Assertions.assertArrayEquals(list.toArray(), blist2.toArray());
    }

    @Test
    public void testBinarySearchTree2() {
        BinarySearchTree<Integer> b = new BinarySearchTree<>();
        int[] data = { 10, 5, 20, 1, 30 };
        for (int i : data) {
            b.add(i);
        }
        List<Integer> pre = b.getInPreOrder();
        List<Integer> post = b.getInPostOrder();
        Assertions.assertArrayEquals(pre.toArray(), new Integer[] { 10, 5, 1, 20, 30 });
        Assertions.assertArrayEquals(post.toArray(), new Integer[] { 1, 5, 30, 20, 10 });
    }
}
