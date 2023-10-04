package OOP;

///Создайте класс OOP.Phone, котрый содержит переменные number,model,weight
///Создайте 3 экземпляра этого класса,Выведите на консоль значния их переменных
public class praktika_OOP {
    public static void main(String[] args) {
        Phone phone1=new Phone(200,"samsung",37533);
        Phone phone2=new Phone(250,"iphone",37544);
        Phone phone3=new Phone(300,"xiaomi",37525);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
    }
}
