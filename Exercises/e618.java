import java.util.*;

public class e618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int t = n;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(t-1));
            System.out.print("*".repeat(2*i-1));
            System.out.println();
            t--;
        }
        int m = n;
        for (int j = 1; j <= n; j++) {
            System.out.print(" ".repeat(j));
            System.out.print("*".repeat(2*m-3));
            System.out.println();
            m--;
        }
    }
}
