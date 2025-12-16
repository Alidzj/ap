import java.util.*;

public class e613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        int[] binary =  new int[count];
        int index = count - 1;
        int temp2 = n;
        while (temp2>0){
            binary[index] = temp2%2;
            temp2=temp2/2;
            index--;
        }
        for (int i = 0; i < count; i++){
            System.out.print(binary[i]);
        }
    }
}
