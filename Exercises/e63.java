import java.util.*;

public class e63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write how many words you want to enter: ");
        int n = input.nextInt();
        String[] words = new String[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter word "+i+": ... ");
            words[i-1] = input.next();
        }
        for (int i = 0 ; i < words.length ; i++){
            String word = words[i];
            for (int j = 0 ; j < word.length() ; j++){
                char ch = word.charAt(j);
                if (Character.isUpperCase(ch)){
                    System.out.format("uppercase letter in %d is : %c\n" , i+1 , ch);
                }
            }
        }

        for (int i = 0 ; i < words.length ; i++){
            char ch = words[i].charAt(1);
            System.out.format("second letter of word %d is: %c\n" ,  i+1, ch);
        }

        int countvowels = 0;
        for (int i = 0 ; i < words.length ; i++){
            String word = words[i];
            for (int j = 0 ; j < word.length() ; j++){
                char ch = word.charAt(j);
                if ("aeiouAEIOU".indexOf(ch)!=-1){
                    countvowels++;
                }
            }
        }
        System.out.println("Number of vowels is "+countvowels);

        for (int i = 0 ; i < words.length ; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    System.out.println("'" + ch + "' found at index: " + j);
                }
            }
        }

        for (int i = 0 ; i < words.length ; i++){
            words[i] = words[i].replaceAll("[aeiouAEIOU]", "_");
        }
        for (int i = 0 ; i < words.length ; i++){
            System.out.format("word %d is : %s\n " , i+1 , words[i]);
        }
    }
}
