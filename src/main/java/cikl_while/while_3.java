package cikl_while;

import java.util.Scanner;

public class while_3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        scanner.close();
        int number=1;
        int fuct=1;
        while (number<=a){
            fuct*=number;
            number++;
        }
        System.out.println(fuct);

    }
}
