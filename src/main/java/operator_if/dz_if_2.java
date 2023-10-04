package operator_if;

import java.util.Scanner;

public class dz_if_2 {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите координаты первой клетки x и y: ");
        x1=scanner.nextInt();
        y1=scanner.nextInt();
        System.out.println("Введите координаты второй клетки x и y: ");
        x2=scanner.nextInt();
        y2=scanner.nextInt();
        if (x1==x2 || y1==y2){
            System.out.println("Можно сделать ход ");
        }
        else {System.out.println("Ход не возможен ");}
    }
}
