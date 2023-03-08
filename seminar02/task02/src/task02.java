// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class task02 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = iScanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            array[i] = iScanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        iScanner.close();

        Logger logger = Logger.getLogger(task02.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.log(Level.INFO, Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}