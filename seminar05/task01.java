// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь
// несколько телефонов.

import java.util.*;

public class task01 {
    public static void main(String[] args) {
        Map<String, ArrayList> directory = new HashMap<>();
        while (true) {
            System.out.print("Введите фамилию или \"exit\" для выхода: ");
            Scanner iScanner = new Scanner(System.in);
            String name = iScanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Введите номера телефонов через пробел: ");
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            String[] numbers = iScanner.nextLine().split(" ");
            try {
                for (String number : numbers) {
                    phoneNumbers.add(Integer.parseInt(number));
                }
            } catch (Exception ex) {
                System.out.println("Введен неправильный номер!");
            }
            directory.put(name, phoneNumbers);
        }
        System.out.println(directory);
    }
}

