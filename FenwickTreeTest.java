package FenwickTree.code1;

import FenwickTree.code1.FenwickTree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class FenwickTreeTest {

    @org.junit.jupiter.api.Test
    void setValue() {
        ArrayList<Integer> k = new ArrayList<>();
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);
        FenwickTree tree = new FenwickTree(k);
        tree.setValue(1,3);
        assertEquals(3, tree.get(1));

    }

    @org.junit.jupiter.api.Test
    void getSum() {

        ArrayList<Integer> k = new ArrayList<>();
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);
        FenwickTree tree = new FenwickTree(k);
        assertEquals(9, tree.getSum(1,3));
    }
}