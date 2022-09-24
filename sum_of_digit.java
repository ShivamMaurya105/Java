import java.util.Scanner;

public class sum_of_digit
{
    public static void main(String [] args)
    {
        int n,sum=0,digit;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=a.nextInt();
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum is "+sum);
    }    
}
