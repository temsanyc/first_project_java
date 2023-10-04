package matrix;

import java.util.Scanner;
///на ввод подается 2 числа размерность матрицы и самма матрица.Ввывести номер строк, в которых среднее арифметическое эл-тов >0
public class praktika_matrix {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        n=scanner.nextInt();
        m=scanner.nextInt();
        int [][]matrix=new int[n][m];
        System.out.println("Введите эл-ты матрицы");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matrix[i][j]=scanner.nextInt();

            }
        }
        double number=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                number+=matrix[i][j];
            }
            if (number/m>0) {
                System.out.println(i);
            }
            number=0;
        }
    }
}
