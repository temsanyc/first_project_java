import java.util.Scanner;

public class praktika_4 {
    public static void main(String[] args) {
        int riverspeed,speed,distance;
        Scanner scanner=new Scanner(System.in);
        distance=scanner.nextInt();
        riverspeed=scanner.nextInt();
        speed=scanner.nextInt();
        scanner.close();
        int time;
        time=distance/(speed+riverspeed);




        System.out.println("Пройденное расстояние : " + distance);
    }
}
