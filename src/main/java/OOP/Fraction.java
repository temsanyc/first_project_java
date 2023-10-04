package OOP;

public class Fraction {
    private int number;
    private double fraction;

    public Fraction(double a){
        this.number=(int) a/1;
        this.fraction=a%1;
    }
    public void sum(Fraction  fraction2){
        System.out.println(this.fraction+fraction2.fraction+this.number+fraction2.number);
    }

    public double sub(Fraction fraction1,Fraction fraction2){
        System.out.println(fraction1.number-fraction2.number+fraction1.fraction-fraction2.fraction);
        return fraction1.number-fraction2.number+fraction1.fraction-fraction2.fraction;
    }

    public double mult(Fraction fraction1,Fraction fraction2){
        System.out.println(fraction1.number*fraction2.number+fraction1.fraction*fraction2.fraction);
        return fraction1.number*fraction2.number+fraction1.fraction*fraction2.fraction;
    }

    public boolean ifEquals(Fraction fraction1,Fraction fraction2){
        if (fraction1.number==fraction2.number && fraction1.fraction==fraction2.fraction)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "OOP.Fraction{" +
                "number=" + number +
                ", fraction=" + fraction +
                '}';
    }
}
