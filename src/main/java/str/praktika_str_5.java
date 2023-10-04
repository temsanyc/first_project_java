package str;

import java.util.Scanner;
//Вводится строка из чесил,ищем максимально число введенное с клавиатуры
public class praktika_str_5 {
    public static void main(String[] args) {

    String str;
    Scanner scanner=new Scanner(System.in);
    str=scanner.nextLine();
    scanner.close();
    int max=Integer.MIN_VALUE;
    String[ ] strings=str.split(" ");
        for (int i = 0; i <strings.length ; i++) {
            if(Integer.valueOf(strings[i])>max){
                max=Integer.valueOf(strings[i]);
            }
        }
    System.out.println(max);
    }
}
