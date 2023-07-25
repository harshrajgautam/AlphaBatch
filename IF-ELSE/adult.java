import java.util.Scanner;
public class adult{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the age :");
        int n = sc.nextInt();

        if(n >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teenager");
        }
    }
}