// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернёт «перевёрнутый» список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            list.add(new Random().nextInt(5));
        }
        System.out.println(list);
        ReverseList(list);
        System.out.println(list);
    }

    public static void ReverseList(LinkedList<Integer> col) {
        for (int i = 0; i < col.size() / 2; i++) {
            int temp = col.get(i);
            col.set(i, col.get(col.size() - 1 - i));
            col.set(col.size() - 1 - i, temp);
        }
    }

/*    public static void ReverseList(LinkedList<Integer> col) {
        Collections.reverse(col);
    }*/
}
