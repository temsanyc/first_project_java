package operator_if;

import java.util.Scanner;

public class praktika_if_11 {
    public static void main(String[] args) {
        int n,m,x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность бассейна");
        n=scanner.nextInt();
        m=scanner.nextInt();
        System.out.println("Введите раccтояние");
        x=scanner.nextInt();
        y=scanner.nextInt();

        if (x>=n/2)
            x=n-x;
        if (y>=m/2)
            y=m-y;

        if(x<y)
            System.out.println("Расстояние до ближайшего бортика = " +x);
        else System.out.println("Расстояние до ближайшего бортика = " +y);

    }
}
