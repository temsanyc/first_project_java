package operator_if;

import java.util.Scanner;

public class praktika_if_7 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();
        boolean ifExist=true;
        if (b+c<a) ifExist=false;
        else if (b+a<c) ifExist=false;
        else if (c+a<b) ifExist=false;
        if (ifExist)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
