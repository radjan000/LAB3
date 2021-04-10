package LAB3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Task> list = new ArrayList<>();

        Task task1 = new Task("Zad1", "Bla1", Task.Category.NEW, LocalDateTime.of(2021, 3, 5, 12, 1));
        Task task2 = new Task("Zad2", "Bla2", Task.Category.IN_PROGRESS, LocalDateTime.of(2020, 1, 2, 23, 59));
        Task task3 = new Task("Zad3", "Bla3", Task.Category.DONE, LocalDateTime.now());
        Task task4 = new Task("Zad4", "Bla4", Task.Category.NEW, LocalDateTime.now());

        task4.setStop(task4.getStop().plusMonths(3));

        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);

        for (Task task : list) {
            System.out.println(task);
        }
    }
}
