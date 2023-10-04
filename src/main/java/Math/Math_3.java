package Math;

import java.util.Scanner;
///вычисляем периметр и площадь прямоугольного треугольника
public class Math_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите длины катетов");
        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.close();

        int c;
        c=(int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Гипотенуза равна "+c);
        int P;
        P=a+b+c;
        int squar;
        squar= a*b/2;
        System.out.println("Периметр равен " + P);
        System.out.println("Площадь треугольника равна "+squar);
    }
}
