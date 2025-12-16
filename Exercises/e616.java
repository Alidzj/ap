import java.util.*;

public class e616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j+"   ");
            }
        }
    }
}
