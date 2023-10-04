package matrix;

import java.util.Scanner;
///на вход падается размерность матрицы и ее эл-ты, матрица КВАДРАТНАЯ, определить симметричная ли матрица, относительно главной диагонали?
public class praktika_matrix_4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        System.out.println("введите эл-ты матрицы");
        int [][] matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }

        boolean ifSymetric=true;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]!=matrix[j][i])
                    ifSymetric=false;
            }
        }
        if (ifSymetric)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
