package massive;

import java.util.Scanner;
///вывести максимальный эл-т массива
public class praktika_massive_3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("введите эл-т массива");
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Максимальный эл-т массива "+max);
    }
}
