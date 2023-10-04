package matrix;

import java.util.Scanner;
///На ввод подается 2 числа- размерность матрицы и сама матрица, далее подается 2 номера строки, отнимите вторую от первой!
public class praktika_matrix_2 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();
        System.out.println("Введите эл-ты матрицы");
        int [][]matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int first,second;
        System.out.println("Введите номера строк, какую отнять от какой");
        first=scanner.nextInt();
        second=scanner.nextInt();
        scanner.close();
        for (int i = 0; i < m; i++) {
            matrix[first][i]-=matrix[second][i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
