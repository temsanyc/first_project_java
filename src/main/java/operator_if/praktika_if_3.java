package operator_if;

import java.util.Scanner;

public class praktika_if_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        if (a>=b){
            System.out.println(a);
        }else System.out.println(b);
    }
}
