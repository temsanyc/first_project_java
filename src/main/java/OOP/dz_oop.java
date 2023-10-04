package OOP;

import OOP.Student;

import java.util.Scanner;

public class dz_oop {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите фамилию ученика: " );
        student.setSurname(scanner.nextLine());
        System.out.println("Введите имя ученика: ");
        student.setName(scanner.nextLine());
        student.average();
        System.out.println(student);
    }
}
