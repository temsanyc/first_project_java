package massive;

import java.util.Scanner;
///Дан массив чисел. Выведите все элементы массива, которые больше предыдущего элемента.
//Формат входных данных:
//- в первой строке вводится количество элементов в массиве.
//- во второй строке вводятся элементы массива.
public class dz_massive {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите колличество эллемнтов в массиве");
        a=scanner.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Введите эллемнт массива");
            arr[i]=scanner.nextInt();
        }
        String box="";
        String box_1="";
        for (int i = 1; i <a; i++) {
            if (arr[i] > arr[i - 1])
                box += arr[i] + ",";
        }
        if (box_1.equals(box))
            System.out.println("Эллементов которые больше предыдущего, нет!");

        else
            System.out.println("Элемент массива, который больше предыдущего элемента " + box);

    }


}

