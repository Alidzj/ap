import java.util.*;

public class e518 {
    public static void main(String[] args) {
        String[] word =  new String[3];
        word[0] = "Charlie";
        word[1] = "Able";
        word[2] = "Baker";

        Arrays.sort(word);
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
    }
}

