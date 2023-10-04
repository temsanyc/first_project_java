package Math;

import java.util.Scanner;
///тригонометрическая калькулятор
public class Math_5 {
    public static void main(String[] args) {
        int number;
        String sign;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите операцию sin,cos,tan,ctan");
        sign=scanner.nextLine();
        System.out.println("Введите число");
        number=scanner.nextInt();


        switch (sign){
            case "sin":
                System.out.println(Math.sin( Math.toRadians(number)));
                break;
            case "cos":
                System.out.println(Math.cos(Math.toRadians(number)));
                break;
            case "tan":
                System.out.println(Math.cos(Math.toRadians(number)));
                break;
            case "ctan":
                System.out.println(1/Math.tan(Math.toRadians(number)));
                break;
            default:
                System.out.println(" Не верная операция");
        }

    }
}
