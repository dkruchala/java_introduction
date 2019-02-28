
import java.util.Arrays;

public class sockMerchantExample {

  static int sockMerchant(int[] ar) {
    int result = 0;
    Arrays.sort(ar);
    for(int i = 0; i < ar.length-1; i++ )
    {
      if (ar[i] == ar[i+1]){
        result += 1;
        i++;
      }
    }
    return result;
}
  public static void main(String[] args) {
    int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    System.out.println(sockMerchant(ar));
  }
}
