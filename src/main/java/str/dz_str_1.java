package str;

import java.util.Scanner;

public class dz_str_1 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner=new Scanner(System.in);
        ch=scanner.next().charAt(0);
        if (ch>=48 && ch<=57){
            System.out.println("Введенный символ является числом");
            if (ch%2==0)
                System.out.println("И оно четное");
            else
                System.out.println("И оно не четное");
        }
        else
            System.out.println("Введеный символ не я вляется числом");
    }
}
