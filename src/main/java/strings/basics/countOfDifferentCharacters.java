package strings.basics;

import java.util.Scanner;

public class countOfDifferentCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper=0, lower=0, special=0, digits=0;

        System.out.println("Enter the sequence of characters: ");
        String sequence = sc.nextLine();

        for(int i = 0; i < sequence.length(); i++){
            char ch = sequence.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            }else {
                special++;
            }
        }

        System.out.println("Uppercase letter: "+ upper);
        System.out.println("Lowercase letter: "+ lower);
        System.out.println("Digits: "+ digits);
        System.out.println("Special Characters: "+ special);
    }
}
