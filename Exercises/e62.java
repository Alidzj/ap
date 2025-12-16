import java.util.*;

public class e62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write 3 number : ...");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;
        int max = a;
        int oddcount=0;
        int evencount=0;
        int sum=0;

        if (a < c  && b < c) {
            max = c;
        }
        else if (a < b  && c < b) {
            max = b;
        }

        if ( c < a && c < b){
            min = c;
        }
        else if ((b < c) && (b < a)) {
            min = b;
        }
        System.out.println("min is : "+min);
        System.out.println("max is : "+max);

        if (a%2 == 0){
            evencount++;
        }
        if (b%2 == 0){
            evencount++;
        }
        if (c%2 == 0){
            evencount++;
        }
        if (a%2==1){
            oddcount++;
        }
        if (b%2==1){
            oddcount++;
        }
        if (c%2==1){
            oddcount++;
        }

        System.out.println("evencount is : "+evencount);
        System.out.println("oddcount is : "+oddcount);

        System.out.print("sum is : "+sum);
        sum += a;
        System.out.print(" "+sum);
        sum += b;
        System.out.print(" "+sum);
        sum += c;
        System.out.print(" "+sum);

        if (a==b){
            System.out.println("a and b are same numbers :"+a);
        }
        if (b==c){
            System.out.println("b and c are same numbers :"+b);
        }
    }
}
