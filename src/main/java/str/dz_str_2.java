package str;

import java.util.Arrays;
import java.util.Scanner;
///Вводится строка.
//Необходимо вывести те слова, в которых первая и последняя буквы совпадают.
public class dz_str_2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку");
        str=scanner.nextLine();
        String [] strArr=str.split(" ");
        boolean ifArray=false;
        String words="";
        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            char ch=strArr[i].charAt(0);
            char ch1=strArr[i].charAt(strArr[i].length()-1);

            if (ch==ch1){
                ifArray=true;
                words+=strArr[i]+" ";
            }

        }
        if (ifArray){
            System.out.println(words);
        }
        else
            System.out.println("Cовпадений нет");


    }
}


