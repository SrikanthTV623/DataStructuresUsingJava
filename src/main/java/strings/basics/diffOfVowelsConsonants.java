package strings.basics;

import java.util.Scanner;

//Find the Difference between the Number of Consonants and Vowels

public class diffOfVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels = 0, consonants = 0;
        int diff = 0;
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                //if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                //      ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        diff = consonants - vowels;
        System.out.println("Difference between the Number of Consonants and Vowels "+ diff);
    }
}
