package switch_praktika;

import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {
        int a,b;
        char sig;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        sig=scanner.next().charAt(0);

        switch (sig){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Не корректный знак");

        }

    }
}
