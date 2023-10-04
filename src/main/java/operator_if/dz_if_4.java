package operator_if;

import java.util.Scanner;

public class dz_if_4 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();
        scanner.close();
        int a= (int) Math.pow(x,2);
        int b=(int) Math.pow(y,2);
        int c=(int) Math.pow(z,2);

        if (a+b==c||a+c==b||b+c==a){
            System.out.println("Может быть");

        }else System.out.println("Не может быть");
    }
}
