import java.util.Scanner;

public class number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value");
        int number=sc.nextInt();
        switch(number){
            case 1: System.out.println("Samosha");
            break;
            case 2: System.out.println("burger");
            break;
            case 3: System.out.println("Momos");
            break;
            case 4: System.out.println("Pizza");
            break;
        default : System.out.println("no any thing");
        }
    }
}
