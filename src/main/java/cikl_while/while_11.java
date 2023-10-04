package cikl_while;

import java.util.Scanner;

public class while_11 {
    public static void main(String[] args) {
        int number, max,Premax;
        Scanner  scanner=new Scanner(System.in);
        number=scanner.nextInt();
        max=number;
        Premax=number;

        do {
            if (number>max){
                Premax=max;
                max=number;
            }
            if (number>=Premax && number<max){
                Premax=number;
            }
            number=scanner.nextInt();
        }
        while (number!=0);
        System.out.println(Premax);
    }
}
