import java.util.Scanner;

public class praktika_2 {
    public static void main(String[] args) {
        int number,nextnuber;
        Scanner scanner= new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();
        nextnuber=number+2-number%2;
        System.out.println(nextnuber);
    }
}
