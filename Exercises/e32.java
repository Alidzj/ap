import java.util.*;

public class e32 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                System.out.format("enter element[%d][%d] : " , j+1 , k+1);
                matrix[j][k]=sc.nextInt();
            }
        }

        int determinan = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        System.out.format("determian is %d " , determinan);
    }
}
