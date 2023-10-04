package OOP.discriminatori_1;

import java.util.Scanner;

public class Discriminatory_1 {
    int a;
    int b;
    int c;
    float disc;
    String result;
    float x1;
    float x2;

    @Override
    public String toString() {
        return "OOP.discriminatori_1.Discriminatory_1{" +
                "Коэффицииент "+ "a"+ " ="+ a +
                ", Коэффициент "+ "b"+ " ="+ b +
                ", Коэффициет "+"c"+" =" + c +
                ", Дискриминант=" + disc +
                ", Результат=" + result +
                ", Первый корень x1=" + x1 +
                ", Второй корень x2=" + x2 +
                '}';
    }

    public void disc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэфицинты квадратного уровнени а,b,c: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        disc = (float) Math.pow(b, 2) - (4 * a * c);

    }
    public void roots(){
        if (disc < 0)
            result = "Корней нет";
        else if (disc == 0) {
            result = "Один корень";
            x1 =(float) -b / (2 * a);
        }
        else  {
            result = "Два корня";
            x1 = (float) ((-b - Math.sqrt(disc)) / 2 * a);
            x2 = (float) ((-b + Math.sqrt(disc)) / 2 * a);
        }
    }
}

