package cikl_while;

import java.util.Scanner;

public class while_1 {
    public static void main(String[] args) {
        int a=8,i=-1;
        Scanner scanner=new Scanner(System.in);

        while (a!=0){
            a=a-1;
            i+=1;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
