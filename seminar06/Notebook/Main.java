package Notebook;

public class Main {
    public static void main(String[] args) {

        Notebook laptop01 = new Notebook("Apple", "Apple M1", 32, 256, 13.6,"MacOS", "silver");
        Notebook laptop02 = new Notebook("Dell", "Intel Core i7", 16, 512, 15.6, "Linux", "grey");
        Notebook laptop03 = new Notebook("HP", "Intel Core i5", 8, 256, 15.6, "Windows", "grey");
        Notebook laptop04 = new Notebook("Acer", "AMD Ryzen 5", 8, 128, 13.3, "Windows", "blue");
        Notebook laptop05 = new Notebook("Lenovo", "AMD Ryzen 7", 16, 512, 16.2, "Windows", "black");
        Notebook laptop06 = new Notebook("ASUS", "Intel core i5", 8, 256, 14.2, "Windows", "white");

        Notebook.models.add(laptop01);
        Notebook.models.add(laptop02);
        Notebook.models.add(laptop03);
        Notebook.models.add(laptop04);
        Notebook.models.add(laptop05);
        Notebook.models.add(laptop06);

        laptop01.filterLaptops();

    }
}