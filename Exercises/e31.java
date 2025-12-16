import java.util.*;

public class e31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Rows in matris1 :");
        int rows1 = sc.nextInt();

        System.out.println("enter the number of Columns in matris1 and Rows in matris2 :");
        int Columns1 = sc.nextInt();
        int rows2 = Columns1;


        System.out.println("enter the number of Columns in matris2 :");
        int Columns2 = sc.nextInt();

        int[][] matrix1 = new int[rows1][Columns1];
        int[][] matrix2 = new int[rows2][Columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < Columns1; j++) {
                System.out.format("Enter element in [%d][%d] in matris1 : ", i+1 , j+1);
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < Columns2; j++) {
                System.out.format("Enter element in [%d][%d] in matris2 : ", i+1 , j+1);
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] matrix3 = new int[rows1][Columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < Columns2; j++) {
                for (int k = 0; k < Columns1; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("--------");
        for (int i = 0; i < rows1; i++) {
            System.out.println();
            for (int j = 0; j < Columns2; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
        }
    }
}
