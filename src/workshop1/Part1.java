/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop1;

import java.util.Scanner;
public class Part1 {
    public static void main( String[] args){
        int rows, colm, sum = 0;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter rows:");
        rows = sc.nextInt();
      
        System.out.println("Enter colm:");
        colm = sc.nextInt();
      
      
        matrix = new int[rows][colm];
        System.out.println(" Enter the matrix:");
        for ( int i =0 ; i < rows ; i++){
            for( int j =0; j < colm ; j++){
                System.out.print("\nm["+i+"]["+j+"]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("matrix input");
        for ( int i = 0 ; i < rows ; i++){
            for( int j = 0; j < colm ; j++){
                System.out.format("%3d", matrix[i][j]);
                
            }
            System.out.println("\n");
        }
        
        
        for ( int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < colm ; j++){
                sum += matrix[i][j];
            }
        }
        
        
        System.out.println("sum:" + sum);
        System.out.println("Average:" + (float)sum/(rows*colm));
    }
}
