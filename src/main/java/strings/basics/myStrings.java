package strings.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class myStrings {

    //Check if There are Two or Three Consecutive Identical Characters in a String
    public boolean consecutiveIdenticalCharacters(String input){
        int count = 1;
        boolean found = false;
        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) == input.charAt(i - 1)) {
                count++;
            }else {
                if (count == 2 || count == 3) {
                    System.out.println("Found: " + input.substring(i - count, i));
                    found = true;
                }
                count = 1;
            }
        }
        // Final check at end of string
        if (count == 2 || count == 3) {
            System.out.println("Found: " + input.substring(input.length() - count));
            found = true;
        }

        return found;
    }


    //Check if a String Contains All Letters from 'a' to 'z'
    //1st code
    public boolean containsAllCharacterAtoZ(String input){
        String updatedStr = input.replaceAll(" ", "");

        Set<Character> set = new HashSet<>();
        for(char c : updatedStr.toLowerCase().toCharArray()){
            set.add(c);
        }
        int size = set.size();
        /*
        //using map
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : updatedStr.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1 );
        }
        int size = map.size();

         */
        if(size == 26){
            return true;
        }
        return false;
    }

    //2nd code
    public static boolean containsAllAlphabets(String input) {
        input = input.toLowerCase(); // Case-insensitive
        boolean[] alphabet = new boolean[26];

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all 26 letters are present
        for (boolean present : alphabet) {
            if (!present) return false;
        }

        return true;
    }

    //Insert a Character at the First, Last, and Kth Position in a String
    public static String insertCharactersToString(String input, int position){
        StringBuilder sb = new StringBuilder(input);

        //insert a character at first position
        sb.insert(0,'S');
        //insert a character at last position
        sb.insert(sb.length(), 'K');
        //insert a character at Kth Position
        if(position < 0 || position > sb.length()){
            System.out.println("Invalid Position");
        }else {
            sb.insert(position, 'U');
        }

        return  sb.toString();
    }

    public static String insertAtFirst(String input, char ch){
        return ch + input;
    }

    public static String insertAtLast(String input, char ch){
        return input + ch;
    }

    public static String insertAtKthPosition(String input, char ch, int position){
        if(position < 0 || position > input.length()){
            System.out.println("Invalid Position Value");
        }
            return input.substring(0,position)+ ch + input.substring(position);
    }

    //Remove the First, Last, and Kth Character from a String
    public static String removeAtFirst(String input){
        if(input.isEmpty()) return input;
        return input.substring(1);
        /*
        //2nd code
        StringBuilder sb = new StringBuilder(input);
        sb.deleteCharAt(0);
        return sb.toString();
         */
    }

    public static String removeAtLast(String input){
        if (input.isEmpty()) return input;
        return input.substring(0,input.length() - 1);
        /*
        //2nd code
        StringBuilder sb = new StringBuilder(input);
        sb.deleteCharAt(input.length());
        return sb.toString();
         */
    }

    public static String removeAtKthPosition(String input, int position){
        if(position < 0 || position > input.length()){
            System.out.println("Invalid Position");
        }
        return input.substring(0,position)+input.substring(position + 1);
        /*
        StringBuilder sb = new StringBuilder(input);
        sb.deleteCharAt(position);
        return sb.toString();
         */
    }

    //Find a Specific Substring within a String
    public static String findingSpecificSubString(String string, String subString){
        /*
        //1st code
        int index = string.indexOf(subString);
        if (index != -1){
            System.out.println("Found at index:"+index);
        }else {
            return "Not found";
        }
        return "";
         */

        //2nd code
        int m = string.length();
        int n = subString.length();
        for(int i = 0; i <= m - n; i++){
            if(string.substring(i,i+n).equals(subString)){
                return "Found at index " + i;
            }
        }
        return  "Not found";
    }

    public static void getAllSubStrings(String input){
        /*
        //1st code
        //time complexity = o(n2), space complexity = O(1)(for only printing) O(k)(for storing)
        System.out.println("All Possible SubStrings");
        for(int i = 0; i < input.length(); i++){
            for (int j = 0 + i; j <= input.length(); j++){
                System.out.print(input.substring(i,j)+ " ");
            }
        }

         */

        //2nd code
        //here we optimize the solution using the string builder
        //because string creation not happens multiple times
        System.out.println("All Possible SubStrings");
        for(int i = 0; i < input.length(); i++){
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < input.length(); j++){
                sb.append(input.charAt(j));
                System.out.print(sb.toString() + " ");
            }
        }

    }

}
