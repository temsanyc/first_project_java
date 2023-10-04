package Math;

import java.util.Scanner;

///Мы имеем уравнение вида:ax + b = 0 На вход подаются коэффициенты a и b. Найти x.
public class dz_Math_1 {
    public static void main(String[] args) {
            int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите коэффициент a");
        a=scanner.nextInt();
        System.out.println("Введите коэффициент b");
        b=scanner.nextInt();
        scanner.close();
        int x;
        if (a==0 && b!=0)
            System.out.println("Решения нет");

        else if (a==0 && b==0)
            System.out.println("X может быть любым числом");
        else {
            x=(-b)/a;
            System.out.println("X равен "+x);
        }

    }
}
