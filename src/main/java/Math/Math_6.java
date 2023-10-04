package Math;

import java.util.Scanner;

///на вход подаются две стороны треугольника и градусная мера угла между ними, вывести площадь данного треугольника
public class Math_6 {
    public static void main(String[] args) {
        int a,b,grad;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника");
        a=scanner.nextInt();
        System.out.println("Введите первую сторону треугольника");
        b=scanner.nextInt();
        System.out.println("Введите градустную меру угла");
        grad=scanner.nextInt();
        scanner.close();
        int square;

        square=(int) (0.5*a*b*Math.sin(Math.toRadians(grad)));
        System.out.println("Площадь треугольника равна "+square);
    }
}
