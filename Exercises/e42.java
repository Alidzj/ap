import java.util.*;

public class e42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the thing that you want : ");
        String input = sc.nextLine();
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
}