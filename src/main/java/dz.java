import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        int a,summa;
        Scanner scanner= new Scanner(System.in);
        a=scanner.nextInt();
        summa=a%10+(a/100)%10+(a/10)%10+(a/1000)%10;
        System.out.println(summa);
    }
}
