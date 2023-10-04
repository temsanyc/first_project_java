package massive;

import java.util.Arrays;
import java.util.Scanner;

public class praktika_massive {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите эл-т массива");
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (array[i]%2!=0)
                System.out.println(array[i]);
        }

     }
}
