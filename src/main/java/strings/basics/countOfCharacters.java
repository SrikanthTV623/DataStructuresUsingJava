package strings.basics;

import java.util.Scanner;
//Count Letters, Numbers, and Special Characters in a String
//Ex: abcdefg12345@#!%


public class countOfCharacters {
    public static void main(String[] args) {
        int lettersCount=0, digitCount=0, specialCharCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String sequence = sc.nextLine();

//        for(int i = 0; i < sequence.length(); i++){
//            if(Character.isDigit(sequence.charAt(i))){
//                digitCount++;
//            }else if(Character.isLetter(sequence.charAt(i))){
//                lettersCount++;
//            }else {
//                specialCharCount++;
//            }
//        }


        for(char ch : sequence.toCharArray()){
            if(Character.isLetter(ch)){
                lettersCount++;
            }else if(Character.isDigit(ch)){
                digitCount++;
            }else{
                specialCharCount++;
            }
        }
        System.out.println(digitCount +" "+lettersCount +" "+specialCharCount);
    }
}
