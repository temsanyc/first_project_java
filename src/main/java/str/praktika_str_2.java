package str;

import java.util.Scanner;
///проверить является ли строка полиндромом (одинаковой если читать в обе стороны)
public class praktika_str_2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        scanner.close();

        char[] letters=new  char[str.length()];
        letters=str.toCharArray();
        boolean ifPolidrom=true;
        for (int i = 0,j=letters.length-1; i <letters.length/2 && j>letters.length/2 ; j--,i++) {
            if (letters[i]!=letters[j]) {
                ifPolidrom = false;
            }
        }
        if (ifPolidrom)
            System.out.println("Polidrom");
        else
            System.out.println("Not polidrom");
    }
}
