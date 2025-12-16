import java.util.*;

public class e41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the thing that you want : ");
        String input = sc.nextLine();
        System.out.println("write the thing that you want to serach : ");
        char search = sc.next().charAt(0);

        int count = 0;

        for (int i=0;i<input.length();i++) {
            if (input.toLowerCase().charAt(i) == search) {
                count++;
            }
        }
        System.out.println("count is "+count);
    }
}
