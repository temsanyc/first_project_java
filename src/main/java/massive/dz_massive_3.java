package massive;

import java.util.Scanner;

public class dz_massive_3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();

        float [] array=new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите эл-ты массива");
            array[i]=scanner.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i]<min && array[i]%2==0) {
                min = (int) array[i];
            }

        }
        for (int i = 0; i < n; i++) {
            array[i]/=min;
            System.out.println(array[i]);
        }
    }
}
