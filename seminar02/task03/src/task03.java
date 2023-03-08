/* 3.** Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил
[оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String str;
        while ((str = br.readLine()) != null) {
            str = str.replace("[", "").replace("]", "");
            String[] dataStr = str.split("}");

            ArrayList<String[]> dataArr = new ArrayList<>();
            for (int i = 0; i < dataStr.length; i++) {
                dataStr[i] = dataStr[i].replace("{", "").replace(",", ":").replace("\"", "");
                dataArr.add(dataStr[i].split(":"));
            }

            StringBuilder sb = new StringBuilder();
            for (String[] item : dataArr) {
                for (int j = 0; j < item.length; j++) {
                    if (item[j].equals("фамилия")) {
                        sb.append("Студент ").append(item[j + 1]);
                        continue;
                    }
                    if (item[j].equals("оценка")) {
                        sb.append(" получил ").append(item[j + 1]);
                        continue;
                    }
                    if (item[j].equals("предмет")) {
                        sb.append(" по предмету ").append(item[j + 1]).append(".\n");
                    }
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}
