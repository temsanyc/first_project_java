package cikl_for;

import java.util.Scanner;
///таблица умножения
public class for_5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        scanner.close();
        int step=10;
        for (int i = 0; i <=step ; i++) {
            System.out.println(i+" x "+number +" = "+number*i);

        }
    }
}
