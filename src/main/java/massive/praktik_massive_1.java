package massive;

import java.util.Scanner;
///вывести эл-ты массива которые равны предыдущем
public class praktik_massive_1 {
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
        for (int i = 1; i < n; i++) {
            if (arr[i]==arr[i-1])
                System.out.println(arr[i]);

        }
    }
}
