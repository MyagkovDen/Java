// Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task02 {
    public static void main(String[] args) {

        LinkedList<Integer> q = new LinkedList<>();
        Enqueue(q, 4);
        Enqueue(q, 2);
        Enqueue(q, 1);
        Enqueue(q, 7);
        System.out.println(q);

        int d = Dequeue(q);
        System.out.println(d);
        System.out.println(q);

        int f = First(q);
        System.out.println(f);
        System.out.println(q);
    }
    public static void Enqueue (LinkedList<Integer> col, int number) {
        col.add(number);
    }
    public static int Dequeue (LinkedList<Integer> col) {
       return col.removeFirst();
    }
    public static int First (LinkedList<Integer> col) {
        return col.getFirst();
    }
}
