package PATTERNS;

import java.util.Scanner;

public class HalfPyramid {
  public static void main(String[]args){
     Scanner sc =new Scanner(System.in);
    int n=5;

    for (int i = 0; i < n; i++) {
          //outer loop
          
          for (int j = 1; j <n-i; j++) {
            // inner loop for space

            System.out.print(" ");
          }      

          for (int j = 0; j < 2*i+1; j++) {
             //inner loop for star

            System.out.print("*");
          }
          System.out.println();
    }


    sc.close();
  }
}
