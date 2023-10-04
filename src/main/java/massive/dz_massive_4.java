package massive;

import java.util.Arrays;
import java.util.Scanner;
///На вход подаётся размерность массива и сам массив. Определите количество разных равных элементов.
public class dz_massive_4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n = scanner.nextInt();
        System.out.println("введите эл-ты массива");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] == array[i + 1])
                count++;
        }

        System.out.println("Колличество разных равных эл-тов массива "+ Arrays.toString(array) +" равно "+count);
    }

}