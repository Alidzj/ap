import java.util.*;

public class e46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a thing : ");
        char[] s =  sc.nextLine().toCharArray();
        
        for (int i=s.length-1;i>0;i--) {
            if (s[i]==s[i-1]) {
                s[i]=' ';
            }
        }
        for (int i=0;i<s.length;i++) {
            if (s[i] != ' '){
                System.out.print(s[i]);
            }
        }
    }
}
