package operator_if;

import java.util.Scanner;

public class dz_if_7 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int temp;

        if (b >= a) {
            temp = a;
            a = b;
            b = temp;
        }
        if (c >= b) {
            temp = b;
            b = c;
            c = temp;
        }
        if (b >= a) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
