import java.util.*;

public class e43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a thing : ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int[] count = new int[s.length()];

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println("first one repeated character : " + s.charAt(i));
                return;
            }
        }
    }
}
