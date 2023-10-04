package cikl_for;

import java.util.Scanner;
///На вход подаётся число. Вывести сумму всех натуральных чётных чисел, находящихся до этого числа.
public class dz_for {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        int loc=2;
        int sum=0;
        for (int i =1; i <=number ; i++) {

            if (i%loc==0)
                sum+=i;

        }
        System.out.println("Сумма всех натуральных чисел стоящих до "+number+ " равно "+sum);
    }
}
