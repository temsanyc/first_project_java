package OOP.discriminatori;

import java.util.Scanner;

//Определить класс «квадратное уравнение» с полями а, б и с - коэффициентами уравнения.
//Написать метод, который возвращает дискриминант.
public class Discriminatory {
    int a;
    int b;
    int c;
    int disc;
    String result;
    double x;
    double y;



    @Override
    public String toString() {
        return "OOP.discriminatori.Discriminatory{" +
                "Коэффицииент "+ "a"+ " =" + a +
                ", Коэффициент "+ "b"+ " =" + b +
                ", Коэффициет "+"c"+" =" + c +
                ", Дискриминант=" + disc +
                ", Результат="+result+
                '}';
    }

    public void disc(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите коэфицинты квадратного уровнени а,b,c: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        disc=(int) Math.pow(b,2)-(4*a*c);
        if (disc<0)
            result="Корней нет";
        else if (disc==0)
            result="Один корень";
        else
            result="Два корня";
    }
}
