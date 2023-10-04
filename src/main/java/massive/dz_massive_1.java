package massive;

import java.util.Scanner;
///Выведите все элементы массива, стоящие на чётных позициях. На вход подаётся размерность массива и сами элементы.
//Пример ввода: 7.
//2 4 7 1 6 3 1
//Вывод: 2 7 6 1.
public class dz_massive_1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Введите размерность массива");
        n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
                System.out.println("Введите эл-т массива");
                arr[i]=scanner.nextInt();
        }
        String box="";
        for (int i = 0; i <n ; i+=2) {
            box+=arr[i]+",";
        }
        System.out.println("Эллементы массива стоящие на четных позициях "+box);
    }
}
