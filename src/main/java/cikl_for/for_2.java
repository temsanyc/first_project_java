package cikl_for;

import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;
/// возведение числа в 3-ю степень с for
public class for_2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=number ; i++) {
            System.out.println(Math.pow(number,3));
        }
    }
}
