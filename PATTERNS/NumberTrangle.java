package PATTERNS;

public class NumberTrangle {
   public static void main(String[]args){

    int n=5;

    for (int i = 0; i < n; i++) {
          //outer loop

          for (int j = 1; j <=i+1; j++) {
             //inner loop for number
             
            System.out.print(j);
          }
          System.out.println();
    }


  }
}
