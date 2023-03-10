import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task03 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(new Random().nextInt(100));
        }

        int sum = 0;
        for (int item : list) {
            sum += item;
        }

        System.out.println(list);
        System.out.printf("Минимальное значение списка: %d\n", Collections.min(list));
        System.out.printf("Максимальное значение списка: %d\n", Collections.max(list));
        System.out.printf("Среднее арифметическое списка: %d\n", sum / list.size());
        //System.out.printf("Средний элемент списка: %d", list.get(list.size() / 2));
    }
}
