package matrix;

import java.util.Arrays;
import java.util.Scanner;
///На вход подаётся размерность матрицы. Далее матрица заполняется случайными числами от 0 до 9 включительно.
// Разверните введённую строку матрицы задом наперед.
public class dz_matrix_3 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();

        int [][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=(int) (Math.random()*11);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int line;
        System.out.println("Введите строку которую нужно развернуть");
        line=scanner.nextInt()-1;
        int [] newLine=new int[m];
        for (int i = 0; i < m; i++) {
            newLine[i]=matrix[line][i];
        }

        for (int i = 0; i < m/2; i++) {
            int temp = newLine[i];
            newLine[i] = newLine[m - i - 1];
            newLine[m - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[line][j]=newLine[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
