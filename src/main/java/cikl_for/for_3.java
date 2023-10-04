package cikl_for;

import java.util.Scanner;

public class for_3 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число");
        num1=scanner.nextInt();
        System.out.println("Введите второе число");
        num2=scanner.nextInt();
        scanner.close();
        int temp;
        String loc=":";
        if (num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        for (int i = num1; i <=num2 ; i++) {
            if (i%3==0) {
                loc +=  i;
                loc+=",";
            }
        }
        System.out.println("Все числа которые длятся на 3 в промежутку от "+num1+" до "+num2+" следующие"+loc );
    }
}
