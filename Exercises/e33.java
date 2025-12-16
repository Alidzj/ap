import  java.util.*;

public class e33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] matrix = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=rand.nextInt(100);
            }
        }

        int RowMax = 0;
        int R = 1;
        for(int k=0;k<5;k++){
            RowMax =+ matrix[0][k];
        }

        for (int k=1;k<5;k++){
            int temp = 0;
            for(int j=0;j<5;j++){
                temp =+ matrix[k][j];
            }
            if (temp>RowMax){
                RowMax = temp;
                R = k+1;
            }
        }
        System.out.format("max row is %d and amout of it is : %d" , R , RowMax);
    }
}
