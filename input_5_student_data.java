import java.util.Scanner;
class input_5_student_data25
{
    public static void main(String[]args)
    {
        Scanner inputdata=new Scanner(System.in);
        int num1,num2,num3,num4,num5,result;
        float percent;
        System.out.println("Enter the first number:");
        num1=inputdata.nextInt();
        System.out.println("Enter the second number:");
        num2=inputdata.nextInt();
        System.out.println("Enter the third number:");
        num3=inputdata.nextInt();
        System.out.println("Enter the fourth number:");
        num4=inputdata.nextInt();
        System.out.println("Enter the fifth number:");
        num5=inputdata.nextInt();
        result=num1+num2+num3+num4+num5;
        System.out.println(result);
        percent=result/5;
        System.out.println(percent);
        if(percent>=80)
        {
        System.out.println("Outstanding");
        }
        else if((60<=percent)&&(percent<80))
        {
        System.out.println("First Division");
        }
        else if((50<=percent)&&(percent<60))
        {
        System.out.println("Second Division");
        }
        else if((40<=percent)&&(percent<50))
        System.out.println("Third Division");
        else
        System.out.println("Fail");



    }
}