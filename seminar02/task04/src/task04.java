//4*. К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите  a: ");
        int a = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        // iScanner.nextLine();
        char act = iScanner.next().charAt(0);
        if ((act != '+') && (act != '-') && (act != '*') && (act != '/')) {
            System.out.println("Ошибка ввода операции!");
        }
        System.out.print("Введите b: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (act == '+') {
            int res = a + b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if (act == '-') {
            int res = a - b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if (act == '*') {
            int res = a * b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if ((act == '/') && (b != 0)){
            float res = (a * 1.0f / b);
            System.out.printf("%d %c %d = %f", a, act, b, res);
        }
        else if ((act == '/') && (b == 0)){
            System.out.println("Ошибка ввода! На 0 делить нельзя!");
        }





    }
}