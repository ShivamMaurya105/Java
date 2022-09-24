import java.util.Scanner;
 class prime_or_not 
{
    public static void main(String []args)
    {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the number");
      int i=2;
      int num=a.nextInt();
      while(i<=num/2)
      {
          if(num%i==0)
          break;
          else
          i++;
      }
      if(num%i==0)
      System.out.println("Not prime");
      else
      System.out.println("Prime");
    }  
}
