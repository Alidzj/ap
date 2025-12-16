import java.util.*;

public class e34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("enter num of rows");
        int row = sc.nextInt();
        System.out.println("enter num of columns");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        int[][] matrixT = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixT[j][i] = matrix[i][j] ;
            }
        }

        System.out.println("----------------");
        for (int i = 0; i < column; i++) {
            System.out.println();
            for (int j = 0; j < row; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
        }
    }
}
