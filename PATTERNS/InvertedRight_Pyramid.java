package PATTERNS;

public class InvertedRight_Pyramid {
  public static void main(String[]args){

    int n=5;

    for (int i = 0; i < n; i++) {
          //outer loop

          for (int j = n-i; j >=1; j--) {
             //inner loop for star
             
            System.out.print("*");
          }
          System.out.println();
    }


  }
}
