package operator_if;

import java.util.Scanner;

public class praktika_if_2 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner= new Scanner(System.in);
        x=scanner.nextInt();
        y=scanner.nextInt();
        scanner.close();
        if (x%2!=0 && y%2!=0){
            System.out.println("Белая");
        }else System.out.println("Черная");
    }
}
