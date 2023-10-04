
//Создать класс «машина» с полями: марка, модель, объём двигателя и год выпуска.
//Переопределить метод equals, который определяет по модели и году выпуска эквивалентны ли две машины.
package OOP.car;

import java.util.Objects;

public class Car {
    public String brand;
    public String model;
    public double engine;
    public int age;

    public Car(String model, int age) {
        this.model = model;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj)
            return true;

        if (obj==null || getClass()!=obj.getClass())
            return false;
        Car car =(Car) obj;
        return age==car.age && Objects.equals(model, car.model);
    }

}
