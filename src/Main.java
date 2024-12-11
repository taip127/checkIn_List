import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        // 1.Create an ArrayList to store names of students.
        students.add("John");
        students.add("Adam");
        students.add("Bob");
        students.add("Mary");
        students.add("Paul");

        //3. Print the list of names.
        System.out.println(students);

        //4. Remove a name and print the updated list.
        students.remove(3);
        System.out.println(students);

        //5. Sort the list alphabetically and print the sorted list.
        Collections.sort(students);
        System.out.println(students);






    }
}