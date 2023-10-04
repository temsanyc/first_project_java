package str;

import java.util.Arrays;
import java.util.Scanner;
//Вводится строка, в которой слова разделяются пробелами. Найти самое длинное слово.
public class dz_str_3 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку");
        str=scanner.nextLine();
        String[] strs=str.split(" ");

        String word="";
        for (int i = 0; i < strs.length-1; i++) {
                if (strs[i].length()>strs[i+1].length()){
                    word=strs[i];
                }
                else if (strs[i].length()<strs[i+1].length()){
                    word=strs[i+1];
                }
                else if (strs[i].length()==strs[i+1].length())
                    System.out.println("Cлово: "+ strs[i]+" равно по длине со словом: "+strs[i+1]);
            }
        System.out.println("Самое длинное слово в строке: "+str+" : "+word);
    }
}
