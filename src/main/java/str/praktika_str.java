package str;

import java.util.Scanner;
/// по введеным значением определитть число это или нет
public class praktika_str {
    public static void main(String[] args) {
        char ch;
        Scanner scanner=new Scanner(System.in);
        ch=scanner.next().charAt(0);
        scanner.close();

        if (ch>=48 && ch<=57)
            System.out.println("Числовой");
        else
            System.out.println("не числовой");
    }
}
