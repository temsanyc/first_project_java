package switch_praktika;

import java.util.Scanner;

public class switch_2 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        scanner.close();

        switch (a){
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четыре");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 9:
                System.out.println("девять");
                break;
            case 10:
                System.out.println("десять");
                break;
            default:
                System.out.println("Не корректный набор");
        }
    }
}
