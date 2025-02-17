package arrays.codes;

import java.util.Scanner;

public class NoOfDaysAboveAverageTemperature {
    public static void main(String[] args) {
        int sum = 0,above=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many days temperatures?");
        int no_of_days = sc.nextInt();
        int temp_arr[] = new int[no_of_days];
        for (int i=0;i<temp_arr.length;i++){
            System.out.print("Day "+(i+1)+"'s high temp:");
            temp_arr[i]=sc.nextInt();
            sum += temp_arr[i];
        }

        double average =  (double) sum / no_of_days;

        for (int k=0;k<temp_arr.length;k++){
            if(temp_arr[k]>average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average = "+average);
        System.out.println(above+" day(s) above average");
    }
}
