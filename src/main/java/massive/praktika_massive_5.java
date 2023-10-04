package massive;

import java.util.Arrays;
import java.util.Scanner;

public class praktika_massive_5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите эл-ты массива");
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                    if (array[i]>array[j]) {
                        int temp = array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
            }

        }
        int count=1;
        for (int i = 0; i < n-1; i++) {
            if (array[i]!=array[i+1])
                count++;
        }
        System.out.println(count);
    }

}
