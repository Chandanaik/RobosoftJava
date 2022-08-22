/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substring;

import java.util.Scanner;

/**
 *
 * @author Chandana I K
 */
public class SubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int count=0;
      
      for(int i=0;i<2;i++)
      {
        for(int j=str.length()-2;j<=str.length()-1;j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }  
         
         
      }
       if(count==2){
             for(int k=2;k<str.length();k++){
                 System.out.print(str.charAt(k));
             }
          }
          else{
              System.out.println(str);
          }
    }
    
}
