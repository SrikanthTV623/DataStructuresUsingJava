package arrays.codes;

import java.util.Scanner;

public class NoOfDaysAboveAverageTemperature {
    public static void main(String[] args) {
        int sum = 0,count=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many days temperatures?");
        int no_of_days = sc.nextInt();
        int temp_arr[] = new int[no_of_days];
        for (int i=0;i<temp_arr.length;i++){
            System.out.print("Day "+(i+1)+"'s high temp:");
            temp_arr[i]=sc.nextInt();
        }
        System.out.println();

        for (int j=0;j<temp_arr.length;j++){
            sum = sum + temp_arr[j];
        }

        float average = (float) sum / no_of_days;
        System.out.println("Average = "+average);

        for (int k=0;k<temp_arr.length;k++){
            if(temp_arr[k]>average){
                count++;
            }
        }
        System.out.println(count+" day(s) above average");
    }
}
