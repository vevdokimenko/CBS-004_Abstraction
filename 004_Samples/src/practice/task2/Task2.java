package practice.task2;

public class Task2 {
    public static void main(String[] args) {
        Printable[] items = {
                new Book(),
                new Magazine()
        };

        for (Printable item : items) {
            item.print();
        }
    }
}
