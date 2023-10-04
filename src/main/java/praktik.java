import java.util.Scanner;

public class praktik {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         int n;
         int k;
         System.out.println("ВВведите колличество белочек:");
         n= scanner.nextInt();
         System.out.println("ВВведите колличество орешков:");
         k=scanner.nextInt();
         scanner.close();
         int a=k/n;
         System.out.println("Кооличество орешков, которое получет каждая белочка = " + a);
    }
}
