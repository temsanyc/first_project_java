package operator_if;

import java.util.Scanner;

public class praktika_if_12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();

        int temp;
        if (b>=c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a>=b){
            temp=a;
            a=b;
            b=temp;
        }
        if (b>=c){
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
