/**
 * cwiczenie1
 */
public class cwiczenie1 {

  public static void main(String[] args) {
    int a = 1,
        b = 1,
        c = 10;

    for (int i = 0; i <= c-1; i++)
    { 
      int result = a; 
      for (int j = 0; j <= i; j++)
      {
        result += Math.pow(2,j)*b;
      }
      System.out.print(result+" ");
    }
  }
}



