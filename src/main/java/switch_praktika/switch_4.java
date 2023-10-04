package switch_praktika;

import java.util.Scanner;

public class switch_4 {
    public static void main(String[] args) {
        int place;
        Scanner scanner=new Scanner(System.in);
        place=scanner.nextInt();

        switch (place){
            case 1:
                System.out.println("Gold medal");
                break;
            case 2:
                System.out.println("Silver medal");
                break;
            case 3:
                System.out.println("Bronze medal");
                break;
            default:
                System.out.println("Wooden medal");
                break;
        }
    }
}
