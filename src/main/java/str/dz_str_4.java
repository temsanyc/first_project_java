package str;

import java.util.Arrays;
import java.util.Scanner;
//На вход подаётся две строки. Определить, есть ли в первой введённой строке вторая.
public class dz_str_4 {
    public static void main(String[] args) {
        String str;
        String str1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 1-ю строку");
        str=scanner.nextLine();
        System.out.println("Введите 2-ю строку");
        str1=scanner.nextLine();
        if (str.contains(str1))
            System.out.println("В строке: "+ str +" есть 2-я строка: "+ str1);
        else
            System.out.println("В строке: "+ str +" нет 2-й строки: "+ str1);
    }
}
