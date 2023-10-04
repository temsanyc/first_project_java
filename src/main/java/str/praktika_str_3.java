package str;

import java.util.Scanner;
///проверяем правильно ли введен ip-адресс
public class praktika_str_3 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        scanner.close();

        String[] strings=new String[4];
        strings=str.split(",");
        boolean ifReal=false;
        if (strings.length==4){
            for (int i = 0; i < 4; i++) {
                int tmp=Integer.valueOf(strings[i]);
                if (tmp>=0&&tmp<256)
                    ifReal=true;
                else {
                    ifReal = false;
                    break;
                }
            }


        }
        else
            ifReal=false;
        if (ifReal){
            System.out.println("Correct");
        }
        else
            System.out.println("Not correct");

    }
}
