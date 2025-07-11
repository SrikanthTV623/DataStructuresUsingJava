package strings.basics;

import java.util.Scanner;

//Count the Number of Words in a String

public class countWordsManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String line = sc.nextLine();

        int wordsCount = 0;
        boolean inWord = false;

        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if(ch != ' ' && !inWord){
                // Start of a new word
                wordsCount++;
                inWord = true;
            }else if(ch == ' ') {
                //end of the current word
                inWord = false;
            }
        }

        System.out.println("Words count: "+ wordsCount);

        /*
        StringBuilder resultedString = new StringBuilder();

        int i = 0;
        int n = line.length();

        //Process words and reduce multiple spaces between words
        boolean inWord = false;
        while(i<n){
            char ch = line.charAt(i);
            if(ch != ' '){
                resultedString.append(ch);
                inWord = true;
            }else if(inWord){
                // Add single space between words
                resultedString.append(' ');
                inWord = false;
            }
            i++;
        }

        System.out.println("Resulted String: " + resultedString.toString());

        String transformed_lines = resultedString.toString();
        String transformed_linesArr[] = transformed_lines.split(" ");
        System.out.println(transformed_linesArr.length);

         */
    }
}
