package matrix;

import java.util.Scanner;

public class praktika_matrix_5 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        int [][]matrix=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int number=scanner.nextInt();
        int couner=number;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==0) {
                    couner--;
                    if (couner==0)
                        System.out.println("can");
                        System.exit(1);
                }
                else
                    couner=number;

                }


        }
        System.out.println("cant");
    }
}
