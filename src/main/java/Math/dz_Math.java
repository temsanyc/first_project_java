package Math;

import java.util.Scanner;
///На вход подается число n и число a, вывести случ. число из промежутка -n до n, a раз
public class dz_Math {
    public static void main(String[] args) {
        int number, a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        System.out.println("Введите количество чисел");
        a=scanner.nextInt();
        int rendNumber;
        String rend=" ";
        for (int i = 1; i <=a ; i++) {
            rendNumber=(int) ((Math.random()*(number+number)-number));
            rend+=" "+rendNumber;


        }
        System.out.print(a+" Случайных чисел в диапазоне от "+-number+" до "+number+" "+rend) ;
    }
}
