/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop1;
import java.util.Scanner;
/**
 *
 * @author 84354
 */
public class part3 {
    public static void main(String[] args){

       boolean space = false;
       String[] list = new String[10];
       String[] firstName = new String[10];
       String[] lastName = new String[10];

       for (int i = 0; i < 10; i++){

         Scanner sc = new Scanner(System.in);
         list[i] = sc.nextLine();

       }

       for (int i = 0; i < 10; i++){
         char[] charArray = list[i].toCharArray();
         for(int j = 0; j < charArray.length; j++) {
              if(Character.isLetter(charArray[j])) {      
                if(space) {
                  charArray[j] = Character.toUpperCase(charArray[j]);

                  space = false;
                }
              }
        
              else {
                space = true;
              }

              }

         list[i] = String.valueOf(charArray);

         }

         System.out.println("Output : \n");
         
         for (int i = 0; i <10; i++){
           firstName[i] = list[i].substring(0,1).toUpperCase();
           lastName[i] = list[i].substring(1,list[i].length());

           list[i] = firstName[i] + lastName[i];

           System.out.println(list[i]);

         }
    }
}
