package matrix;

import java.util.Scanner;
//На вход подаётся размерность матрицы и сами элементы матрицы. Найдите максимальный элемент матрицы. Если таковых несколько, то вынести индексы первого.
public class dz_matrix {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();
        int [][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;

        int line=0;
        int column=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max<matrix[i][j]) {
                    max = matrix[i][j];
                    line = i;
                    column = j;
                }
            }
        }
        System.out.println("Максимальный эл-т матрицы "+max+" c индексом строки "+line+" и столбца "+column);
    }
}
