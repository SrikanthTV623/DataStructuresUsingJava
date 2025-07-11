package strings.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Find the Maximum and Minimum Occurring Characters in a String
//Most frequently (maximum occurring), Least frequently (minimum occurring)

public class OccurringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : input.toCharArray()){
            if(ch != ' '){
                map.put(ch,map.getOrDefault(ch,0) + 1);
                /*
                //above line is the replacement of this code
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    map.put(ch, map.get(ch)+1);
                }
                 */
            }
        }

        System.out.println(map);
        /*
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            min = min>entry.getValue()?entry.getValue():min;
            max = max<entry.getValue()?entry.getValue():max;
        }
        char minKey = ' ',maxKey=' ';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(min == entry.getValue()) minKey = entry.getKey();
            if(max == entry.getValue()) maxKey = entry.getKey();
        }

        System.out.println(minKey+ " "+ min);
        System.out.println(maxKey +" "+ max);

         */

        char minChar = ' ';
        char maxChar = ' ';
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            char freqChar = entry.getKey();

            if(freq < minValue){
                minValue = freq;
                minChar = freqChar;
            }

            if(freq > maxValue){
                maxValue = freq;
                maxChar = freqChar;
            }
        }

        System.out.println("Maximum Occurring Character: " + maxChar + " (" + maxValue + " times)");
        System.out.println("Minimum Occurring Character: " + minChar + " (" + minValue + " time" + (minValue > 1 ? "s" : "") + ")");
    }
}
