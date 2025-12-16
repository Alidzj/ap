import java.util.*;

public class e515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("write your salary : ...");
        int a = sc.nextInt();
        sc.close();

        if ( a < 0){
            System.out.println("wrong number! try again");
        }
        if ( a >= 0 && a <= 50000){
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n " , a*99/100 , a/100 );
        }
        if ( a > 50000 && a <= 75000){
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n" , a*98/100 , a*2/100);
        }
        if ( a > 75000 && a <= 100000) {
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n " , a*97/100 , a*3/100 );
        }
        if ( a > 100000 && a <= 250000){
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n " , a*96/100 , a*4/100 );
        }
        if ( a > 250000 && a <= 500000){
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n " , a*95/100 , a*5/100 );
        }
        if ( a > 500000 ){
            System.out.format("your salary after tax is %d\nyour tax amount is %d\n " , a*94/100 , a*6/100 );
        }
    }
}
