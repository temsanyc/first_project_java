import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class praktika_1 {
    public static void main(String[] args) {
        int number,dex;
        Scanner scanner= new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        dex =(number/10)%10;
        System.out.println(dex);
    }
}
