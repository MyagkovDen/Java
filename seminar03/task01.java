// Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            lst.add(new Random().nextInt(100));
        }
        System.out.println(lst);
        MergeSort(lst);
        System.out.println(lst);
    }

    public static void MergeSort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() / 2) {
                    left.add(list.get(i));
                } else {
                    right.add(list.get(i));
                }
            }
            MergeSort(left);
            MergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;
            while ((i < left.size()) && (j < right.size())) {
                if (left.get(i) < right.get(j)) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()) {
                list.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {
                list.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }
}
