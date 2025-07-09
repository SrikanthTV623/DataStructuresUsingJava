package arrays.Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        int matrix1[][] = new int[m][n];
        int matrix2[][] = new int[p][q];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        if(n != p){
            System.out.println("Matrix Multiplication is not possible, provided invalid input");
        }else{
            int product[][] = new int[m][q];
            for (int i = 0; i < product.length; i++){
                for (int j = 0; j < product[0].length; j++){
                    for(int k = 0; k < n; k++){
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            for(int i = 0; i < product.length; i++){
                for (int j = 0; j < product[0].length; j++){
                    System.out.print(product[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
