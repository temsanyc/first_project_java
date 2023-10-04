package cikl_while;

import java.util.Scanner;

public class while_7 {
    public static void main(String[] args) {
        int number,step;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        System.out.println("Введите степень");
        step=scanner.nextInt();
        scanner.close();
        int temp=number;
        while (step!=1){
            number*=temp;
            step-=1;

        }
        System.out.println(number);
    }
}
