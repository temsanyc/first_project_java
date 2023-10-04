package cikl_while;

import java.util.Scanner;

public class dz_while {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        int cost=1;
        int func=0;

        while  (func<=number){

            func= (int) Math.pow(cost,2);
            if (func>number)
                break;
            System.out.println(func);
            cost+=1;
            }
    }
}
