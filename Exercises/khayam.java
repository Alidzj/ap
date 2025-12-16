import java.util.*;

public class khayam {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ...");
        int k=sc.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.print(" ".repeat(k - i));
            System.out.println("* ".repeat(i));
        }
    }
}
