package operator_if;

import java.util.Scanner;

public class praktika_if_1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.close();
        if (a%2!=0){
            System.out.println("Нечетное");
        }else System.out.println("Четное");
    }
}
