package Math;

import java.util.Scanner;

public class Math_1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();
        int p,square;
        p=(a+b+c)/2;
        square=(int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника равна "+square);
    }
}
