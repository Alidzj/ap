import java.util.*;

public class khayam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ...");
        int k = sc.nextInt();
        sc.close();

        int[] A = new int[k];
        A[0] = 1;

        for (int i = 1; i <= k; i++) {
                System.out.print(" ".repeat(k - i));

                if ( i == 2){
                    A[1] = 1;
                }

            if (i > 2) {
                A[i - 1] = 1;
                for (int j = i-2 ; j > 0 ; j--) {
                    A[j] = A[j - 1] + A[j];
                }
            }
                for ( int c = 0 ; c < A.length; c++) {
                    if(A[c] != 0) {
                        System.out.print(A[c] + " ");
                    }
                }
                System.out.println(" ");

        }
    }
}