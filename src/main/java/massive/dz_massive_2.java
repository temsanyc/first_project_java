package massive;

import java.util.Scanner;
///На вход подаётся размерность массива и сами элементы массива. Выведите индекс минимального элемента массива. Если таковых элементов несколько, то выведите индекс крайнего.
public class dz_massive_2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите эл-т массива");
            arr[i]=scanner.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int index=0;

        for (int i = 0; i < n; i++) {
            if (arr[i]<=min) {
                min = arr[i];
                index = i;
            }

        }
        System.out.println("Минимальный элемент массива: "+min+" ,имеет индекс "+index);







    }
}
