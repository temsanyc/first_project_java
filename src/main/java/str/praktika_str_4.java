package str;

import java.util.Arrays;
import java.util.Scanner;

public class praktika_str_4 {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите квадратное уровнение в виде ax2+bx+c=0");
        str=scanner.nextLine();
        scanner.close();

        str=str.replace("x2","");
        str=str.replace("x","");
        str=str.replace(" ","");
        str=str.replace("=0","");
        String[] strs=new String[3];
        strs=str.split("[+/]");
        int[] coef=new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            coef[i]=Integer.valueOf(strs[i]);
        }
        System.out.println(Arrays.toString(coef));
        int disc;

        int a=coef[0];
        int b=coef[1];
        int c=coef[2];
        disc=(int)Math.pow(coef[1],2)-4*coef[0]*coef[2];
        if (disc<0){
            System.out.println("Нет корней");
            System.exit(1);
        }
        else  if (disc==0){
            int x1;
            x1=(-b/(2*a*c));
            System.out.println("X= "+x1);

        }
        else {
            double x1,x2;
            x1=((-b-Math.sqrt(disc))/(2*a*c));
            x2=((-b+Math.sqrt(disc)))/(2*a*c);
            System.out.println("X1= "+x1);
            System.out.println("X2= "+x2);
        }
    }
}
