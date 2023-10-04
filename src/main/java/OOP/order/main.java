//Написать класс «заказ» с полями: вес, имя и адрес доставки.
//Создать класс customer с полями: имя и адрес. В классе customer реализовать метод, который принимает объект типа заказ и определяет, принадлежит ли он текущему заказчику.
package OOP.order;

public class main {
    public static void main(String[] args) {
        Customer customer=new Customer(12.4,"Anna","Bobruisk2");
        customer.order(customer);
    }
}
