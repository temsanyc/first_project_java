package cikl_while;

import java.util.Scanner;

public class while_5 {
    public static void main(String[] args) {
        int number_1,number_2;
        Scanner scanner=new Scanner(System.in);
        number_1=scanner.nextInt();
        number_2=scanner.nextInt();
        scanner.close();
        int min;
        if (number_1>=number_2){
            min=number_2;
        }
        else
            min=number_1;
        while (min!=0){
            if (number_1%min==0 && number_2%min==0){
                System.out.println(min);
                break;
            }
            min-=1;
        }
    }
}
