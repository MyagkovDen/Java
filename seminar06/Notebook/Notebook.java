package Notebook;

import java.util.*;

public class Notebook {

    String producer;
    String processor;
    int ram;
    int ssd;
    double monitor;
    String os;
    String colour;

    public Notebook(String producer, String processor, int ram, int ssd, double monitor, String os, String colour) {
        this.producer = producer;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.monitor = monitor;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("производитель: %s, процессор: %s, оперативная память: %dGB, жесткий диск: %dGB, диагональ экрана: %f, операционная система: %s, цвет: %s", producer, processor, ram, ssd, monitor, os, colour);
    }

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return producer == t.producer && processor == t.processor && ram == t.ram && ssd == t.ssd && monitor == t.monitor && os == t.os && colour == t.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, processor, ram, ssd, monitor, os, colour);
    }

    static Set<Notebook> models = new HashSet<>();

    public void filterLaptops() {
        TreeMap<Integer, String> parameters = new TreeMap<>();
        parameters.put(1, "производитель");
        parameters.put(2, "процессор");
        parameters.put(3, "объем оперативной памяти");
        parameters.put(4, "объем жесткого диска");
        parameters.put(5, "диагональ экрана");
        parameters.put(6, "операционная система");
        parameters.put(7, "цвет");

        TreeMap<Integer, String> producer = new TreeMap<>();
        producer.put(1, "Apple");
        producer.put(2, "Dell");
        producer.put(3, "HP");
        producer.put(4, "Lenovo");
        producer.put(5, "ASUS");
        producer.put(6, "Acer");

        TreeMap<Integer, String> processor = new TreeMap<>();
        processor.put(1, "Apple M1");
        processor.put(2, "Apple M2");
        processor.put(3, "Intel Core i5");
        processor.put(4, "Intel Core i7");
        processor.put(5, "AMD Ryzen 5");
        processor.put(6, "AMD Ryzen 7");

        TreeMap<Integer, String> ram = new TreeMap<>();
        ram.put(1, "4 GB");
        ram.put(2, "8 GB");
        ram.put(3, "16 GB");
        ram.put(4, "32 GB");

        TreeMap<Integer, String> ssd = new TreeMap<>();
        ssd.put(1, "128 GB");
        ssd.put(2, "256 GB");
        ssd.put(3, "512 GB");
        ssd.put(4, "1 TB");
        ssd.put(5, "2 TB");

        TreeMap<Integer, String> monitor = new TreeMap<>();
        monitor.put(1, "13.3 \"");
        monitor.put(2, "13.6 \"");
        monitor.put(3, "14.2 \"");
        monitor.put(4, "15.6 \"");
        monitor.put(5, "16.2 \"");

        TreeMap<Integer, String> os = new TreeMap<>();
        os.put(1, "MacOS");
        os.put(2, "Linux");
        os.put(3, "Windows");

        TreeMap<Integer, String> colour = new TreeMap<>();
        colour.put(1, "grey");
        colour.put(2, "silver");
        colour.put(3, "black");
        colour.put(4, "white");
        colour.put(5, "blue");

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую параметру фильтрации:");
        for (var item : parameters.entrySet()) {
            System.out.printf("%d - %s\n", item.getKey(), item.getValue());
        }
        int select = iScanner.nextInt();

        System.out.println("Введите цифру, соответствующую критерию фильтрации:");
        switch (select) {
            case 1 -> {
                for (var item : producer.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (producer.get(select).equals(n.producer)) {
                        System.out.println(n);
                    }
                }
                return;
            }
            case 2 -> {
                for (var item : processor.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (processor.get(select).equals(n.processor)) {
                        System.out.println(n);
                    }
                }
            }
            case 3 -> {
                for (var item : ram.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (Integer.parseInt(ram.get(select).split(" ")[0]) == n.ram) {
                        System.out.println(n);
                    }
                }
            }
            case 4 -> {
                for (var item : ssd.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (Integer.parseInt(ssd.get(select).split(" ")[0]) == n.ssd) {
                        System.out.println(n);
                    }
                }
            }
            case 5 -> {
                for (var item : monitor.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (Double.parseDouble(monitor.get(select).split(" ")[0]) == n.monitor) {
                        System.out.println(n);
                    }
                }
            }
            case 6 -> {
                for (var item : os.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (os.get(select).equals(n.os)) {
                        System.out.println(n);
                    }
                }
            }
            case 7 -> {
                for (var item : colour.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                select = iScanner.nextInt();
                for (Notebook n : models) {
                    if (colour.get(select).equals(n.colour)) {
                        System.out.println(n);
                    }
                }
            }
        }
    }
}
