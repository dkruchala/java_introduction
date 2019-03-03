/**
 * enchancedforloop
 */
public class enchancedforloop {

  public static void main(String[] args) {
    int[] liczby = {1,12,41,12,51,12};
    int result = 0;
    for(int value: liczby)
    {
      result += value;
    }
    System.out.println(result);
  }
}