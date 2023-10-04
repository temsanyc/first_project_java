package switch_praktika;

import java.util.Scanner;

public class switch_3 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();

        switch (number){
            case 0:
                System.out.println("Ноль");
                System.exit(1);
                break;
        }

        String str=number>0?"Положительный":"Отрицательный";
        System.out.println(str);
    }
}
