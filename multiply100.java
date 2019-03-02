/**
 * multiply100
 */
public class multiply100 {

  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++)
    {
      for(int j = 1; j <= 10; j++)
      {
        int result = i*j;
        System.out.printf("%d ", result);
      }
      System.out.println();
    }
  }
}