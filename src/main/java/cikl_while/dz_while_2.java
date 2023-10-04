package cikl_while;

import java.util.Scanner;

public class dz_while_2 {
    public static void main(String[] args) {
        int number,step;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        System.out.println("Введите степень");
        step=scanner.nextInt();
        scanner.close();
        float res;

        while (true){
            if (step<0){


                res= (float) 1 / (int) Math.pow(number,Math.abs(step));
                System.out.println(res);
                break;
            }


            res=(int) Math.pow(number,step);
            System.out.println(res);
            break;
        }

    }
}
