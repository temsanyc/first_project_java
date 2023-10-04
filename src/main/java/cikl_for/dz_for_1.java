package cikl_for;

import java.util.Scanner;
///число в любой степени
public class dz_for_1 {
    public static void main(String[] args) {
        int number,step;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        number=scanner.nextInt();
        System.out.println("Введите степень в которую нужно возвести число: ");
        step=scanner.nextInt();
        scanner.close();
        double rez=1;
        if  (step==0) System.out.println(rez);
        for (int i = 1; i <=step ; i++) {

            rez*=number;


        }
        System.out.println("Число "+number+" в степени "+step+" равно "+rez);
    }
}
