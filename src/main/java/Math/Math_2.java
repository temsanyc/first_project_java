package Math;

import java.util.Scanner;
///На вход подаются коэффициенты квадратного уравнения.Уравнение имеет след. вид: ax*2+bx+c=0,решение
public class Math_2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 3 коэффициента квадратного уравнения");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();

        int disc=(int) Math.pow(b,2)-(4*a*c);

        if (disc<0){
            System.out.println("Корней нету");
            System.exit(1);
        }
        if (disc==0){
            int x1;
            x1=-b/(2*a);
            System.out.println("Корень равен "+x1);
            System.exit(1);
        }
        else {
            int x1,x2;
            x1=(int) ((-b-Math.sqrt(disc))/2*a);
            x2=(int) ((-b+Math.sqrt(disc))/2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
