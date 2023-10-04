package operator_if;

import java.util.Scanner;

public class praktika_if_6 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        if (number<=9) System.out.println("Цифра");
        else if (number<=99)  System.out.println("Двухзначное");
        else System.out.println("Трехзначное");
     }
}
