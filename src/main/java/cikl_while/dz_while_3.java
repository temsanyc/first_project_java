package cikl_while;

import java.util.Scanner;
///Вывести все локальные максимумы в последовательности, завершающейся нулём. Строгий локальный максимум, определяется, если значение больше следующего и предыдущего.
public class dz_while_3 {
    public static void main(String[] args) {
        int number, preNumber, postNumber;
        int locmax ;
        Scanner scanner=new Scanner(System.in);
        preNumber=scanner.nextInt();
        number=scanner.nextInt();
        postNumber=scanner.nextInt();

        if (number>preNumber && number>postNumber) {
            locmax = number;
            System.out.println("Local max: "+locmax);
        }

        while (postNumber!=0){
            preNumber=number;
            number=postNumber;
            postNumber=scanner.nextInt();
            if (postNumber==0)
                break;;
            if (number>preNumber && number>postNumber) {
                locmax = number;
                System.out.println("Local max: " +locmax);
            }

        }

    }
}
