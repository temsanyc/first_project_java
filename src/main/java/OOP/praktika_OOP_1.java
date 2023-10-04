package OOP;

///Создайте класс OOP.Person и переменные fullName,age
///Создайте метод move(), talk()
///Выведите на консоль значения переменных класса OOP.Person
public class praktika_OOP_1 {
    public static void main(String[] args) {
        Person person1=new Person("Vitalik",20);
        Person person2=new Person("Yura",40);
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
    }
}
