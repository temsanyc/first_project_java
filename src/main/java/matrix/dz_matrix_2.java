package matrix;

import java.util.Arrays;
import java.util.Scanner;
///На вход подаётся размерность матрицы. Далее матрица наполняется элементами от 0 до 9 (включительно).
// На ввод подаётся номер строки. Заполните главную диагональ элементами той строки.
public class dz_matrix_2 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int line;
        System.out.println("Введите номер строки");
        line = scanner.nextInt();
        int[] newline = new int[m];
        for (int i = 0, j = 0; i < m; i++, j++) {
            newline[j] = matrix[line][i];
        }
        System.out.println(Arrays.toString(newline));
        if (n > m) {
            for (int i = 0; i < m; i++) {
                matrix[i][i] = newline[i];
            }
        }
        else if (n < m) {
            for (int i = 0; i < n; i++) {
                matrix[i][i] = newline[i];

            }
        }
        else if (n == m) {
            for (int i = 0; i < n; i++) {
                matrix[i][i] = newline[i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}


