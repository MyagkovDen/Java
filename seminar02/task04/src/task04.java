//4*. К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task04 {
    public static void main(String[] args) throws IOException {

        Logger lg = Logger.getLogger(task04.class.getName());
        lg.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        lg.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите  a: ");
        int a = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        char act = iScanner.next().charAt(0);
        if ((act != '+') && (act != '-') && (act != '*') && (act != '/')) {
            String msg = "Ошибка ввода операции!";
            System.out.println(msg);
            lg.log(Level.WARNING, msg);
            return;
        }
        System.out.print("Введите b: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (act != '/') {
            int res = 0;
            if (act == '+') res = a + b;
            if (act == '-') res = a - b;
            if (act == '*') res = a * b;
            String result = String.format("%d %c %d = %d\n", a, act, b, res);
            System.out.println(result);
            lg.log(Level.INFO, result);
        }

        if (act == '/') {
            if (b != 0) {
                float res = (a * 1.0f / b);
                String result = String.format("%d %c %d = %f\n", a, act, b, res);
                System.out.println(result);
                lg.log(Level.INFO, result);
            } else {
                System.out.println("Ошибка ввода! На 0 делить нельзя!");
                lg.log(Level.WARNING, "Ошибка ввода! На 0 делить нельзя!");
            }
        }
    }
}