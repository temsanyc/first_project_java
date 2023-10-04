package cikl_for;

public class dz_for_2 {
    public static void main(String[] args) {
        for (int i =1000; i <10000 ; i++) {
            int first,second,third,four;
            first=i%10;
            second=(i/10)%10;
            third=(i/100)%10;
            four=i/1000;
            if (first+second+third+four==first*second*third*four)
                System.out.println(i);

        }
    }
}
