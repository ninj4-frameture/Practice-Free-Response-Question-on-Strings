import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=user_input.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        user_input.close();
    }
}