// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class task02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (1 + Math.random() * 11));
        }
        System.out.println(list);

        list.removeIf(n -> n %2 == 0);

        /* Удаление элементов через цикл
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
            i++;
        }
        */
        /* Удаление элементов через итератор
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
        */
        System.out.println(list);
    }
}
