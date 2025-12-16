import java.util.*;

public class e36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix[i][j]=rand.nextInt(100);
            }
        }


        int max=0;

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                max += matrix[i][j];
            }
        }

        for (int i=0;i<rows-1;i++){
            for (int j=0;j<columns-1;j++){
                int newMax =  matrix[i][j] +
                              matrix[i+1][j] +
                              matrix[i][j+1] +
                              matrix[i+1][j+1];

                if (newMax>max){
                    max=newMax;
                }
            }
        }


        System.out.println("max="+max);
    }
}
