package cikl_while;

import java.util.Scanner;

public class while_2 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        int count=1;

        while (count!=a){
            System.out.println(count);
            count+=1;
        }
    }
}
