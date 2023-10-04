package cikl_while;

import java.util.Scanner;

public class while_8 {
    public static void main(String[] args) {
        int number,step;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        System.out.println("Введите степень");
        step=scanner.nextInt();
        scanner.close();

        while (number!=1){
            if (number%step==0){
                number/=step;
            }else {
                System.out.println("NO");
                System.exit(1);
            }

        }
        System.out.println("Yes");
    }

}

