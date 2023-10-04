package OOP;//Написать класс student с полями фамилия, имя, и массив оценок. Написать метод, который вычисляет средний бал студента.

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String surname;
    private String name;
    private int [] marks;

    private double average;
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void average ()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите колличество оценок: ");
            int n=scanner.nextInt();
            marks= new int[n];
            System.out.println("Введите сами оценки: ");
           double sum=0;
            for (int i=0;i<n;i++){
                marks[i]=scanner.nextInt();
                sum+=marks[i];
            }

            average=sum/n;


    }

    @Override
    public String toString() {
        return "OOP.Student{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Оценки=" + Arrays.toString(marks) +
                ", Средний балл=" + average +
                '}';
    }
}
