package PATTERNS;

public class DiamondStarPattern {
   public static void main(String[]args){

    int n=5;

    for (int i = 0; i < n; i++) {
          //outer loop

          for (int j = 0; j <n-i-1; j++) {
             //inner loop for space
             
            System.out.print(" ");
          }
           for (int j = 0; j <2*i+1; j++) {
             //inner loop for star
             
            System.out.print("*");
          }
          System.out.println();
    }

     for (int i = 0; i < n; i++) {
          //outer loop

          for (int j = 0; j <i; j++) {
             //inner loop for space
             
            System.out.print(" ");
          }
           for (int j = 0; j <2*(n-i)-1; j++) {
             //inner loop for star
              
            System.out.print("*");
          }
          System.out.println();
    }


  }
}
