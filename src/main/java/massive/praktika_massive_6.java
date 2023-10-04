package massive;

import java.util.Scanner;
///на вход подается размерность массива и его эл-ты
///Далее подается 2 числа а и б. Создать новй массив, скопировать туда все эл-ты, принадлежащие промежутку от а до б
public class praktika_massive_6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        n=scanner.nextInt();
        int [] array=new int[n];
        System.out.println("Введите эл-ты массива");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        int a,b;
        System.out.println("Ведите число а: ");
        a=scanner.nextInt();
        System.out.println("Ведите число b: ");
        b=scanner.nextInt();

        if (a>b){
            int temp=b;
            b=a;
            a=temp;
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= a && array[i] <= b)
                count++;
        }
        int [] arrayCount=new int[count];

        for (int i = 0,j=0; i < n; i++) {
            if (array[i]>=a && array[i]<=b){
                arrayCount[j]=array[i];
                j++;
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print(arrayCount[i]+" ");
        }
    }
}
