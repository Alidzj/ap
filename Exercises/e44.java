import java.util.*;

public class e44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a thing : ");
        String s = sc.nextLine();
        String[] newS = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isUpperCase(temp)) {
                temp = Character.toLowerCase(temp);
            }
            else if (Character.isLowerCase(temp)) {
                temp = Character.toUpperCase(temp);
            }
            newS[i] = temp + "";
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(newS[i]);
        }

    }
}
