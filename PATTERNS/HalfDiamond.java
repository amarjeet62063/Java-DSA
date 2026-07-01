package PATTERNS;

public class HalfDiamond {
   public static void main(String[]args){

    int n=5;

    for (int i = 1; i <= n*2-1; i++) {
          //outer loop
          int star=i;

          if (n<i) {
            star=2*n-i;
          }

          for (int j = 1; j <=star; j++) {
             //inner loop for star
             
            System.out.print("*");
          }
          System.out.println();
    }


  }
}
