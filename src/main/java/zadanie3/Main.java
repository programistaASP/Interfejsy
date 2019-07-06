package zadanie3;

import equalsHascode.Czlowiek;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    private static Student Collection;

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 12345);
        Student student1 = new Student("Marcin", "Barnaba", 15234);
        Student student2 = new Student("Wiola", "Lapka", 23145);
        Student student3 = new Student("Ala", "Mala", 13245);
        Student student4 = new Student("Walla", "Malla", 14325);


        Student[] students = new Student[5];

        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        System.out.println("---------------------Przed-Sortowaniu----------------------------");
        for (Student student5 : students) {
            System.out.println(student5.toString());

        }
        System.out.println("---------------------Po-Sortowaniu-odwrotnym---------------------------");
        Arrays.sort(students, Comparator.comparing(Student::getNrAlbumu).reversed());
        for (Student student5 : students) {
            System.out.println(student5.toString());

        }
        System.out.println("---------------------Po-Sortowaniu----------------------------");
        Arrays.sort(students);


        for (Student student5 : students) {
            System.out.println(student5.toString());

        }

    }
}
