package operator_if;

import java.util.Scanner;

public class praktika_if_8 {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите координаты первой фигуры");
        x1=scanner.nextInt();
        y1=scanner.nextInt();
        System.out.println("Введите координаты второй фигуры");
        x2=scanner.nextInt();
        y2=scanner.nextInt();
        scanner.close();

        if (x1==x2 || y1==y2) System.out.println("Бьет");
        else System.out.println("Не бьет");
    }
}
