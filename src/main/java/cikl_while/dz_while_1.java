package cikl_while;

import java.util.Scanner;
//Найдите самый большой натуральный делитель. На вход подаётся одно число. Делитель должен быть отличен от самого числа.
public class dz_while_1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число:");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();

        int count;
        if (number==1) {
            System.out.println("Число не может быть равно 1 т.к. делитель должен быть отличен от числа :");
        }
        System.out.println("Введите другое число :");
        number=scanner.nextInt();
        count=number-1;
        while (count<=number){
            if (number%count==0) {
                System.out.println("Наибольший делитель числа: " + number + " равен: " + count );
                break;
            }
            count-=1;
        }

    }
}

