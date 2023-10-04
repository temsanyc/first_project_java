package str;

import java.util.Arrays;
import java.util.Scanner;

public class dz_str {
    public static void main(String[] args) {
        String str,str1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку");
        str=scanner.nextLine();
        char [] chars=str.toCharArray();
        System.out.println("Введите букву которую хотите посчитать");
        str1=scanner.next();
        char [] chars1=str1.toCharArray();
        int count=0;
        for (int i = 0,j=0; i < chars.length ; i++) {
            if (chars[i]==chars1[j])
                count++;
            else
                continue;
        }
        System.out.println("Буква "+str1+" в строке "+str+" встречается "+count+" раз");

    }
}
