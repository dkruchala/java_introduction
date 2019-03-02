import java.util.Scanner;

/**
 * eofScanner
 */
public class eofScanner {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String data = "";
    int counter = 1;
    while(scan.hasNext())
    {
      data = data + counter + " " + scan.nextLine() + "\n";
      counter++;
    }
    System.out.println(data);
    scan.close();
  }
}