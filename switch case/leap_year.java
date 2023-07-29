import java.util.Scanner;
public class leap_year {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:- ");
        int year=sc.nextInt();
        if(year%4==0){
           System.out.println("leap year");
           if(year%100==0){
             System.out.println("leap year");
             if(year%400==0){
             System.out.println("leap year");}
                }
        }
        else{
            System.out.println("not leap year");
        }
    }
        }