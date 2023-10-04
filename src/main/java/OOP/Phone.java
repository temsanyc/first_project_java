package OOP;

public class Phone {
    private int weight;
    private String model;
    private int number;

    public Phone(int weight,String model,int number){
        this.weight=weight;
        this.model=model;
        this.number=number;
    }

    @Override
    public String toString() {
        return "OOP.Phone{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
