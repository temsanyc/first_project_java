package cikl_for;

import java.util.Scanner;
///вход подается число, вывести на экран его разряды
public class for_4 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        num=scanner.nextInt();
        scanner.close();
        String raz="";
        for (int i = 1; i <=1000 ; i*=10) {
            raz+=(num/i)%10+",";


        }
        System.out.println("Разряды числа: "+ raz);
    }
}
