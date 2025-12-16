import java.util.*;

public class e61e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number : ... ");
        int n = sc.nextInt();
        int sum = 0;
        while ( n > 0 ) {
            int a = n % 10;
            if (a % 2 == 1) {
                sum = sum + a;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
