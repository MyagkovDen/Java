// Пусть дан список сотрудников. Написать программу, которая найдёт и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class task02 {
    public static void main(String[] args) throws IOException {
        Map<String, String> inputNames = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("list.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            String[] input = str.split(" ");
            inputNames.put(input[1], input[0]);
        }
        br.close();

        ArrayList<String> listNames = new ArrayList<>(inputNames.values());
        Set<String> setNames = new HashSet<>(listNames);

        Map<String, Integer> freq = new HashMap<>();
        for (String item : setNames) {
            int count = Collections.frequency(listNames, item);
            if (count > 1) {
                freq.put(item, count);
            }
        }
        // System.out.println(freq);

        LinkedHashMap<String, Integer> sortedNames = new LinkedHashMap<>();
        int max = 0;
        String requiredKey = null;
        int requiredValue = 0;
        while (freq.size() > 0) {
            for (var item : freq.entrySet()) {
                if (item.getValue() > max) {
                    max = item.getValue();
                    requiredKey = item.getKey();
                    requiredValue = item.getValue();
                }
            }
            sortedNames.put(requiredKey, requiredValue);
            freq.remove(requiredKey);
            requiredKey = null;
            requiredValue = 0;
            max = 0;
        }
        System.out.println(sortedNames);

    }
}

