/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя
StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

import java.util.Scanner;

public class  task01 {

    public static void main(String[] args) {

        String text = "SELECT * FROM students WHERE ";

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите данные для фильтрации: "); // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String input = iScanner.nextLine();
        iScanner.close();
        input = input.replace("{", "").replace("}", "").replace("\"", "").replace(":", " ").replace(",", "");
        String[] data = input.split(" ");

        StringBuilder sb = new StringBuilder();
        sb.append(text);
        for (int i = 0; i < data.length; i = i + 2) {
            String check = "null";
            if (data[i + 1].equalsIgnoreCase(check)) continue;
            else {
                String param = String.format("%s = '%s' AND ", data[i], data[i + 1]);
                sb.append(param);
            }
        }
        sb.delete(sb.length() - 5, sb.length() - 1);
        System.out.println(sb);
    }

}