package cikl_while;

import java.util.Scanner;

public class while_9 {
    public static void main(String[] args) {
        int posled,sum;
        Scanner scanner=new Scanner(System.in);
        posled=scanner.nextInt();
        sum=0;
        while (posled!=0){
            sum+=posled;
            posled=scanner.nextInt();

        }
        System.out.println("Сумма всех введенных чисел :" + sum);
    }
}
