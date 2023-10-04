package matrix;

import java.util.Scanner;
//На вход подается размерность матрицы и сама матрица, далее подается 2 числа, поменйте строки с этими номерами местами
public class praktika_matrix_3 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();
        int [][] matrix=new int[n][m];
        System.out.println("Введите эл-ты матрицы");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    matrix[i][j]=scanner.nextInt();
            }
        }
        int a,b;
        System.out.println("введите номера строк которые хотете поменять местами");
        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
                int temp=matrix[a][i];
                matrix[a][i]=matrix[b][i];
                matrix[b][i]=temp;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

    }
}
