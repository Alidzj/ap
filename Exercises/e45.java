import java.util.*;

public class e45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a thing");
        char[] s =  sc.nextLine().toCharArray();
        int sum = 0;

        for(int i=0;i<s.length;i++){
            char temp = s[i];
            if(Character.isDigit(temp)){
                sum += Character.getNumericValue(temp);
            }
        }
        System.out.println("sum is "+sum);
    }
}
