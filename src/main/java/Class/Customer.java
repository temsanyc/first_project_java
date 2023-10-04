package Class;

import java.util.Scanner;
//////1. Создать класс сustomer c полями id: фамилия, имя, дата рождения и номер телефона.
////2. Написать метод в классе customer, который принимает с клавиатуры номер телефона и принимает в качестве аргумента объект типа customer.
//// Нужно проверить совпадает ли номер телефона у переданного объекта и введенный.
public class Customer {
    String surname;
    String name;
    int age;
    int telefonNumber=445623519;
    String adres = "2 Chapel Hill";

    void info(Customer customer){
        int telefonNumber_;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА:");
        telefonNumber_=scanner.nextInt();
        if (customer.telefonNumber==telefonNumber_){
            System.out.println("Совпадают");
        }
        else
            System.out.println("Не совпадают");

    }
    public void adres(Customer customer){
        String adres_;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите адресс: ");
        adres_=scanner.nextLine();
        if(customer.adres.equals(adres_)){
            System.out.println("Адреса совпадают");
        }
        else
            System.out.println("Адреса не совпадают");
    }
}
