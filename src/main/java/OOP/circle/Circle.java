package OOP.circle;

public class Circle {
    static double PI=  Math.PI;

    double radius;
    double square;
    double length;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void lenght(){
        if (radius==0 || radius<0)
            System.out.println("Не допустимое значение радиуса");

        else
            length= 2*PI*radius;
    }
    public void square(){
        if (radius==0 || radius<0)
            System.out.println("Не допустимое значение радиуса");
        else
            square= (float) ( PI*Math.pow(radius,2));
    }

    @Override
    public String toString() {
        lenght();
        square();

        return "Круг{" +
                "радиус=" + radius +
                ", площадь=" + square +
                ", длинна окружности=" + length +
                '}';
    }
}
