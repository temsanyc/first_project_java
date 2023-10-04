package operator_if;

public class dz_if_1 {
    public static void main(String[] args) {
        int a, b, c;
        a = 4;
        b =2;
        c = 1;
        if (a == b && a == c && b == c) {
            System.out.println("3");
        }
        else if (a == b || a==c || b==c  ) {
            System.out.println("2");
        }
        else {System.out.println("0");}
    }
}
