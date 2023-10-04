package massive;

import java.util.Scanner;
///на вход подается размерность и эл-ты массива
//на выходе новый массив, от значения каждого эл-та отняли минимальный положительный эл-т.
public class praktika_massive_4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите эл-ты массива");
            arr[i]=scanner.nextInt();
        }
        int min=Integer.MAX_VALUE;
        boolean ifHavePositive=false;
        for (int i = 0; i < n; i++) {
            if (arr[i]>0 && arr[i]<min){
                ifHavePositive=true;
                min=arr[i];
            }

        }
        if(!ifHavePositive){
            System.out.println("Нету положительных эл-тов");
            System.exit(1);
        }
        for (int i = 0; i < n; i++) {
                arr[i]-=min;
                System.out.println(arr[i]);
        }
    }
}
