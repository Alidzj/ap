import java.util.*;

public class e52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number:...");
        float n = sc.nextFloat();
        sc.close();

        if (n==0) {
            System.out.println("zero");
        }
        if ( n <= 1 && n > 0){
            System.out.println("positive small");
        }
        if ( n < 0 && n >= -1 ){
            System.out.println("negative small");
        }
        if ( n >= 1000000){
            System.out.println("positive large");
        }
        if ( n <= -1000000){
            System.out.println("negative large");
        }
        if ( n > 1 && n < 1000000) {
            System.out.println("positive");
        }
        if ( n < -1 && n > -1000000) {
            System.out.println("negative");
        }
    }
}
