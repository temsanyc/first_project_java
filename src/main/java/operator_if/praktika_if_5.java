package operator_if;

import java.util.Scanner;

public class praktika_if_5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        scanner.close();
        if (a>=6 && a<=11){
            System.out.println("Утро");
        }else if (a>11&&a<=18){
            System.out.println("День");
        }else if (a>18 && a<=22){
            System.out.println("Вечер");
        }else System.out.println("Ночь");
    }
}
