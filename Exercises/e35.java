import java.util.*;

public class e35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("enter num of rows");
        int rows = sc.nextInt();
        System.out.println("enter num of columns");
        int columns = sc.nextInt();
        int[][]  matrix = new int[rows][columns];
        int[][]  newMatrix = new int[rows-1][columns-1];

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=rand.nextInt(100);
            }
        }
        System.out.println("enter the row's number that you want to delete : ");
        int removeRow = sc.nextInt();
        System.out.println("enter the column's number that you want to delete : ");
        int removeColumn = sc.nextInt();

        if (removeRow < 0 || removeRow >= rows ||
                removeColumn < 0 || removeColumn >= columns){
            System.out.println("error");
            return;
        }

        int newI=0;

        for (int i=0;i<rows;i++){
            if (i==removeRow)continue;
            int newJ=0;
            for (int j=0;j<columns;j++){
                if (j==removeColumn)continue;
                newMatrix[newI][newJ]=matrix[i][j];
                newJ++;
            }
            newI++;
        }

        System.out.println("new matrix is : ");
        for (int i=0;i<rows-1;i++){
            System.out.println();
            for (int j=0;j<columns-1;j++){
                System.out.print(newMatrix[i][j]+"\t");
            }
        }
    }
}
