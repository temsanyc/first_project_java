package matrix;

import java.util.Scanner;
///Заполните матрицу случайными числами от 0 до 20 и выведите матрицу в которой все элементы будут умножены на 3. На вход подаются размерности матрицы.
public class dz_matrix_1 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();
        int [][] matrix=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=(int) (Math.random()*(21));
                matrix[i][j]*=3;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
