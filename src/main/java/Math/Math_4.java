package Math;

import java.util.Scanner;
///На вход подается число n , вывести случайное число от-n до n
public class Math_4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        number=scanner.nextInt();
        scanner.close();

        int randNumber;
        randNumber=(int) ((Math.random()*(number+number))-number);
        System.out.println("Cлучайное число в диапазоне от "+-number+" до "+number+" это "+randNumber);

    }
}
