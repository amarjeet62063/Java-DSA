package PATTERNS;
import java.util.*;
public class SolidSquarePattern_01 {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    for (int i = 0; i <n; i++) {
      //outer loop
      for (int j = 0; j < n; j++) {
        //inner loop
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }


}
