import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a,b,c;


        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        a=   scanner.nextInt();
        System.out.println("Введите скорость: ");
        b=  scanner.nextInt();
        c= a/b;
        System.out.println("Время затраченное на путь в часах: "+c);

    }
}
