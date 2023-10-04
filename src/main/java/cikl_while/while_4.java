package cikl_while;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class while_4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        int count=2;

        while (count<=number){
            if (number%count==0){
                System.out.println(count);
                break;
            }
            count+=1;
        }
    }
}
