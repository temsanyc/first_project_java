package massive;

import java.util.Scanner;
///На вход подается размерность массива и сами эл-ты, далее подается число,   индекс которого нужно вывести
public class praktika_massive_2 {
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
        System.out.println("Введите число индекс которого хотите узнать");
        int index=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==index)
                System.out.println(i);

        }
    }
}
