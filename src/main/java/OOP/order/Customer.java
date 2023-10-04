package OOP.order;

public class Customer extends Order {
    String name;
    String adres;
    public Customer(double weight, String name, String adres) {
        super(weight, name, adres);
        this.name="Anna";
        this.adres="Bobruisk";
    }

    public void order(Order order){
        if (this.name==order.name & this.adres==order.adres){
            System.out.println("belongs");
        }
        else
            System.out.println("do not belong");
    }


}
