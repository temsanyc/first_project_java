package OOP;

import java.util.Scanner;

public class praktika_OOP_3 {
    public static void main(String[] args) {
        Car car=new Car("Audi");
        System.out.println("Введите "+car.getModel()+ " максимальную скорость");
        Scanner scanner=new Scanner(System.in);
        car.setMaxspeed(scanner.nextInt());
        System.out.println("Введите "+car.getModel()+ " объем двигателя") ;
        car.setVolume(scanner.nextInt());
        System.out.println(car);
    }
}
