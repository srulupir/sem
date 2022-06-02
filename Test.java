package FenwickTree.code1;

import FenwickTree.code1.FenwickTree;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        long t1, t2;
        System.out.println("1 test");
        for (int n = 1; n < 101; n++) {
            t1 = 0;
            for (int k = 0; k < 25; k++) {
                FileReader file = new FileReader("FenwickTree/FilesForTest/FILE " + n + ".txt");
                Scanner scanner = new Scanner(file);
                ArrayList<Integer> listValues = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    listValues.add(value);
                }
                FenwickTree tree = new FenwickTree(listValues);

                int from = 1;
                int to = listValues.size()-2;
                long start1 = System.nanoTime();
                tree.getSum(from, to);
                long finish1 = System.nanoTime();
                file.close();

                t1 += (finish1 - start1);
            }
            System.out.println(t1/25 );
        }
        System.out.println("2 test");
        for (int n = 1; n < 101; n++) {
            t2 = 0;
            for (int k = 0; k < 25; k++) {

                FileReader file = new FileReader("FenwickTree/FilesForTest/FILE " + n + ".txt");
                Scanner scanner = new Scanner(file);
                ArrayList<Integer> listValues = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    listValues.add(value);
                }
                FenwickTree tree = new FenwickTree(listValues.size());

                int index = 5;
                int val = 40000;
                long start1 = System.nanoTime();
                tree.setValue(index, val);
                long finish1 = System.nanoTime();
                file.close();

                t2 += (finish1 - start1);
            }
            System.out.println(t2/25 );
        }
    }
}
