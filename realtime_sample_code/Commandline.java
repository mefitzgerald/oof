/*
Write a Java program Commandline.java that satisfies the following requirements.
The program reads ONE positive integer m as a command line argument. 
The program then displays the factorial of the integer n.
Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. i.e. 4! = 4*3*2*1 = 24 
For example, running the following command after Commandline.java compiles 

>> java Commandline 4
prints  
24
*/

public class Commandline
{
    public static void main(String args[])
    {
        if(args.length != 0)
        {
            int n = Integer.parseInt(args[0]);
            int total = 1;

            for(int i=1 ; i <= n; i++)
            {
                total= total * i;
            }
            System.out.println("The factorial of !" + n + " = " + total);
        }
        else
        {
            System.out.println("Please enter a valid argument");
        }
    }
}