package operator_if;

import java.util.Scanner;

public class praktika_if_10 {
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
        boolean ifBeat=false;
        if (Math.abs(x1-x2)==2 && Math.abs(y1-y2)==1)
            ifBeat=true;
        else if (Math.abs(y1-y2)==2 && Math.abs(x1-x2)==1)
            ifBeat=true;

        if (ifBeat)
            System.out.println("Beat");
        else System.out.println("no Beat");

    }
}
