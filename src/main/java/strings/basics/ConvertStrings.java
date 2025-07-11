package strings.basics;

import java.util.Scanner;

//Convert Uppercase to Lowercase and Vice Versa in a String

public class ConvertStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();

        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(Character.isUpperCase(ch)){
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            }else {
                toggled.append(ch); // leave digits, spaces, or special characters unchanged
            }
        }

        System.out.println("Transformed String is: "+ toggled.toString());

//        System.out.println(input.toUpperCase());
//        System.out.println(input.toLowerCase());
    }
}
