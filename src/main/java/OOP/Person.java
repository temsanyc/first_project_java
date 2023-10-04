package OOP;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     void talk(){
        System.out.println(this.name+" is  talking");
    }
     void move(){
        System.out.println("OOP.Person at "+this.age+" is moving");
    }
}
