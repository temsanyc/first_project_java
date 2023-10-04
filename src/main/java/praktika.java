import java.util.Scanner;

public class praktika {
    public static void main(String[] args) {
        int n,k,z;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите сколько рублей стоит руллон обоев: " );
        n=scanner.nextInt();
        System.out.println("Введите сколько копеек стоит руллон обоев: " );
        k=scanner.nextInt();
        System.out.println("Введите сколько руллонов обоев нужно купить: " );
        z=scanner.nextInt();
        scanner.close();
        int a;
        a=(n*100+k)*z;
        n=a/100;
        k=a%100;
        System.out.println("Колличество рублей: "+n );
        System.out.println("Колличество копеек: "+ k);
    }
}
