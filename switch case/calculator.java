import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:- ");
        int a=sc.nextInt();
        System.out.print("Enter the value:- ");
        int b=sc.nextInt();
         System.out.print("Enter the value:- ");
        int c=sc.nextInt();
       
        char operator=sc.next().charAt(0);
        switch(operator){
            case'+': System.out.println(a+b+c);
            break;
            case '*': System.out.println(a*b*c);
            break;
            case'-': System.out.println(a-b-c);
            break;
            case'/': System.out.println(a/b/c);
            break;
            case'%': System.out.println(a%b%c);
            break;
            default : System.out.println("wrong input");
        }
    }
    
}
