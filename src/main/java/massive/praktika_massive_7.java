package massive;

import java.util.Arrays;
import java.util.Scanner;
///на входе размерость массива и его эл-ты, Создать новый массив в котором будут только уникальные значения первого массива
public class praktika_massive_7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        System.out.println("введите эл-ты массива");
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int count =1;
        for (int i = 0; i < n-1; i++) {
            if (array[i]!=array[i+1])
                count++;
        }
        int [] arrayNew=new int[count];

        for (int i = 1,j=0; i < n; i++) {
            if (array[i-1]!=array[i]) {
                arrayNew[j] = array[i-1];
                arrayNew[j+1]=array[i];
                j++;
                System.out.println(Arrays.toString(array));
                System.out.println(Arrays.toString(arrayNew));
            }
        }

    }
}
