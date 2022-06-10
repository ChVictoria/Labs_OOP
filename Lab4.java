package Lab4;

import java.util.Arrays;
import java.util.Comparator;

//1429%11=10 Визначити клас студент, який складається як мінімум з 5-и полів.
public class Lab4 {
    public static void main(String[] args) {
        String[] names = {"Вікторія", "Іван", "Дарія", "Катерина", "Ярослав", "Світлана", "Марк", "Марина"};
        int[] scores = {100, 96, 99, 100, 94, 95, 99, 90};
        String[] groups = {"ІО-14", "ІО-17", "ІО-18", "АБ-01", "АВ-01", "АБ-01", "АБ-02", "АБ-03"};
        String[] faculties = {"ФІОТ", "ІПСА", "ФЕЛ", "ФСП", "ТЕФ", "ФБМІ", "ФПМ", "ФМФ"};
        int[] yearsOfBirth = {2005, 2004, 2003, 2003, 2004, 2002, 2002, 2001};

        Student[] students = new Student[names.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], scores[i], groups[i], faculties[i], yearsOfBirth[i]);
        }

        System.out.println("Initial array:");
        outputArray(students);

        Arrays.sort(students);
        System.out.println("Sorted by group:");
        outputArray(students);

        //Arrays.sort(students, Comparator.comparingInt(o -> o.getYearOfBirth()));
        Arrays.sort(students, Comparator.comparingInt(Student::getYearOfBirth).reversed());
        System.out.println("Sorted by year of birth:");
        outputArray(students);
    }
    public static void outputArray(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
