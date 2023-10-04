package cikl_for;

import java.util.Scanner;
///вычисление факториала числа при помощи for
public class for_1 {
    public static void main(String[] args) {
        long number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        int fact=1;

        for (int i=2; i<=number;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
