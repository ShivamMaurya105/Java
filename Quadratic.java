// P2 Quadratic.java
// This program prompts the user to enter co-efficients
// It then computes and outputs the discriminant and any real roots
import java.util.Scanner;

public class Quadratic
{
    // declare instance variables for coefficients, delta and real roots values
    double a;
    double b;
    double c;
    double delta=Math.pow(b,2)-4*a*c;

    // explicit Quadratic constuctor
    public Quadratic(double a1, double b1, double c1 )
    {
	a = a1;
	b = b1;
	c = c1; 
    } // end constructor
    
    //method to set computeDelta
    public void computeDelta()
    {
    double delta=computeDelta;  //store delta
    } // end method setcomputeDelta
    
    //method to get delta value
    public double getDelta()
    {
	return computeDelta;
    } // end method getComputeDelta

    // compute and output roots
    double x1;
    double x2;
    public void roots()
    
    {
	  x1 = (-b + Math.sqrt((Math.pow(b,2) - (4 * a * c)))) / (2 * a);
          x2 = (-b - Math.sqrt((Math.pow(b,2) - (4 * a * c)))) / (2 * a);
    }

    public static void main(String[] args)
    {
	// prompt user for coefficents
	System.out.println("\n\nEnter the coefficients for the quadratic equation");
        
	// create Scanner object to get input from the command window.
	Scanner user = new Scanner(System.in);

        // get input from the user and store it in coefficients a, b, c
	double a = user.nextDouble();
	double b = user.nextDouble();
	double c = user.nextDouble();
      
        // constuct the quadratic object using the coefficients entered 
        Quadratic myQuad = new Quadratic("a1, b1, c1");

        // compute delta value
        myQuad.computeDelta();
        // output delta value
        System.out.print("Delta value is ");
        System.out.println(myQuad.getComputeDelta());

        // depending on delta value
        // output the meanings and if equation has real roots
        if (delta > 0)
	   {
	   System.out.printf("The quadratic equation has two distinct real roots\nx1 = %f\nx2 = %f", x1, x2);
	   }
      
        else if (delta == 0)
	   {
	   System.out.printf("The quadratic equation has two real roots that coincide\nx1 = x2 = %f", x1);
	    }
        else if (delta < 0)
	    {
	    System.out.println("The quadratic equation has no real roots.\n");
	    }
    }// end main      

}// end Quadratic
