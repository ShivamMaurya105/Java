import java.util.Scanner;
public class Odd_or_Even
{
public static void main(String[]args) 
{
    int a;
    Scanner inputdata=new Scanner(System.in);
    System.out.println("Enter the number:");
    a=inputdata.nextInt();
    if(a%2==0)
       System.out.println("Number is Even");
    else
       System.out.println("Number is Odd");

}
    
}
