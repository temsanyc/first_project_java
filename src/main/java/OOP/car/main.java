//Создать класс «машина» с полями: марка, модель, объём двигателя и год выпуска.
//Переопределить метод equals, который определяет по модели и году выпуска эквивалентны ли две машины.
package OOP.car;

public class main {
    public static void main(String[] args) {
        Car car=new Car("golf I",2002);
        Car car1=new Car("golf I",2001);
        System.out.println(car1.equals(car));
    }
}
