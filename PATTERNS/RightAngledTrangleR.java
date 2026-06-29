package PATTERNS;

public class RightAngledTrangleR {
  public static void main(String[]args){

    int n=5 ,number=5;

    for (int i = 0; i <n; i++) {
          //outer loop
          
          for (int j = 0; j <=i; j++) {
             //inner loop for star
             
            System.out.print(number);
            
          }
          number--;
          System.out.println();
    }


  }
}
