package operator_if;

import java.util.Scanner;

public class dz_if_6 {
    public static void main(String[] args) {
        int a,b,c,d,x;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        x=scanner.nextInt();
        int cena=a*100+b;
        int cost=cena*x;
        int money=c*100+d;
        if (cost<=money) System.out.println("Денег хватает");
        else System.out.println("Денег не хватает");
        scanner.close();

    }
}
