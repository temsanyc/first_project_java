package str;

import java.util.Scanner;
//и малой буквы делаем заглавную
public class praktika_str_1 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner=new Scanner(System.in);
        ch=scanner.next().charAt(0);
        scanner.close();
        ch-=32;
        System.out.println(ch);
    }
}
