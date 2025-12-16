import java.util.*;

public class e65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String s = sc.nextLine();
        String[] doubles = s.split(" ");
        DataSet data = new DataSet();
        for (int i = 0 ; i < doubles.length ; i++){
            double number = Double.parseDouble(doubles[i]);
            data.add(number);
        }
    }

    public static class DataSet{
        int count;
        double max;
        double min;
        int sum;
        int avg;
        double range;

        public DataSet(){
            count = 0;
            max = 0;
            min = 0;
            sum = 0;
            range = 0;
        }
        public void add(double number){
            count++;
            sum += number;
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        public double getAverage(){
            if (count != 0){
                return avg = sum/count;
            }
            return 0;
        }
        public double getMax(){
            return max;
        }
        public double getMin(){
            return min;
        }
        public double getSum(){
            return sum;
        }
        public int getCount(){
            return count;
        }
        public double getRange(){
            if ( count != 0) {
                return range = max - min;
            }
            return 0;
        }
    }
}


