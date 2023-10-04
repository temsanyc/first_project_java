package operator_if;

import java.util.Scanner;

public class dz_if_5 {
    public static void main(String[] args) {
        int a,b,c,d,x,y;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        x=scanner.nextInt();
        y=scanner.nextInt();
        scanner.close();
        int sum=a*60+x*60;
        int sum_1=b+y;
        System.out.println(sum);
        System.out.println(sum_1);



        if (sum<=c*60 && sum_1<=d || sum<c*60 && sum_1>=d ) System.out.println(" Успеете");


        else System.out.println("Не успеете");
    }
}
