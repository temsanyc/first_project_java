package cikl_while;

import java.util.Scanner;

public class while_10 {
    public static void main(String[] args) {
       int number;
       int max=Integer.MIN_VALUE;
       Scanner scanner=new Scanner(System.in);
       number=scanner.nextInt();
       while (number!=0){
           if (number>max)
               max=number;
           number=scanner.nextInt();
       }
       System.out.println(max);
    }
}
