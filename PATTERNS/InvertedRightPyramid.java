package PATTERNS;

public class InvertedRightPyramid {
  public static void main(String[]args){

    int n=5;

    for (int i = 0; i < n; i++) {
          //outer loop

          for (int j = 0; j <n-i; j++) {
             //inner loop for star
             
            System.out.print("*");
          }
          System.out.println();
    }


  }
}
