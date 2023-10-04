import java.util.Scanner;

public class praktika_3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        scanner.close();
        int number;
        number=a/2+a%2+b/2+b%2+c/2+c%2;
        System.out.println("Колличество парт: "+number);
    }
}
