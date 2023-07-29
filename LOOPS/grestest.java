
import java.util.Scanner;
public class grestest {
   public static void main(String args[]) {
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the value:-");
    int a=sc.nextInt();
    String type =((a%2) == 0) ? "even":"odd";
    System.out.println(type);

   }
}
