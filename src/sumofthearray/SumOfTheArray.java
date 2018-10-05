/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofthearray;

import java.util.Scanner;
public class SumOfTheArray {

       public static void main(String[] args) {
           double sum=0;
       Scanner input = new Scanner(System.in);
                System.out.println("Enter the Array size");
                int n=input.nextInt();
          double [] Arr= new double [n];
          for(int i=0;i<n;i++){
              System.out.println("Enter the array elements");
              Arr[i]=input.nextDouble();
              sum=sum+Arr[i];
               }
          for(int i=0;i<n;i++){
              System.out.println(Arr[i]);
              
          }
        System.out.println("Array sum is"+sum);
 
    }
    
}
