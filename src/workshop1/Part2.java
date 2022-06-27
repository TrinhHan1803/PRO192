/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop1;
import java.util.Scanner;

public class Part2 {
    public static void main( String[] args){
        float num1,num2;
        String op;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the number 1:");
        num1 = sc.nextFloat();
        sc.nextLine();
        
        System.out.print("Input the number 2 :");
        num2 = sc.nextFloat();
        sc.nextLine();
        
        System.out.print("Input the operator(+ - * /):");
        op = sc.nextLine();
        
        switch (op){
            case "+":
                float sum = num1 + num2;
                System.out.println("The result of " + num1 + op + num2 + "=" + sum);
                break;
            case "-":
                if( num1 < num2){
                    float a = num1;
                    num1 = num2;
                    num2 = a;
                }
                float sub = num1 - num2 ;
                System.out.println("The result of" + num1 + op + num2 + "=" + sub);
                break;
            case "*":
                float mul = num1*num2;
                System.out.println("The result of"+ num1 + op + num2+ "=" + mul);
                break;
            case "/":
                if( num2 != 0){
                    float div = num1 / num2 ;
                         System.out.println("The result of" + num1 + op + num2 + "=" + div );
            }
            default:
                   System.out.println("Error");     
                        
        }    
    }
        
}
