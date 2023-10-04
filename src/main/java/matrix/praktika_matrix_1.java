package matrix;

import java.util.Arrays;
import java.util.Scanner;
///На ввод 2 числа- размерность матрицы и сама матрица, вывести минимальный эл-т из каждой строки
public class praktika_matrix_1 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матицы");
        System.out.println("Колличество строк");
        n=scanner.nextInt();
        System.out.println("Колличество столбцов");
        m= scanner.nextInt();

        int [][]matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]<min)
                    min=matrix[i][j];
            }
            System.out.println(min);
            min=Integer.MAX_VALUE;
        }

    }
}
