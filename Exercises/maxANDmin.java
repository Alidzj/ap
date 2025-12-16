import java.util.*;

public class maxANDmin {
    public static void main(String[] args) {
        Scanner vorody = new Scanner(System.in);
        System.out.println("write a number : ...");
        int A = vorody.nextInt();
        vorody.close();

        Random Shansi = new Random();
        int firstRandomNum = Shansi.nextInt(901)+100;

        int sum  = 0;
        sum += firstRandomNum;
        System.out.format("number 1 is %d:\n ", firstRandomNum);

        int max = firstRandomNum;
        int min =  firstRandomNum;

              for(int i = 2; i <= A; i++){
            int shansi = Shansi.nextInt(901)+100;
            sum += shansi;
            if (shansi > max){
                max = shansi;
            }
            if (shansi < min){
                min = shansi;
            }
            System.out.format("number %d is : %d\n", i, shansi);
        }
        System.out.format("avarage : %d\n ", sum/A);
        System.out.format("min : %d\n ", min);
        System.out.format("max : %d\n ", max);
    }
}
