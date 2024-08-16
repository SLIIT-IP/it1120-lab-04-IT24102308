import java.util.Scanner;
public class IT24102308Lab4Q1
{
     public static void main(String[] args) 
{
//Define Variables
double number;

//Input      
Scanner input = new Scanner(System.in);
System.out.print("Enter a number : ");
number = input.nextDouble();

if (number > 0) 
{System.out.println("The number is Positive");} 

else if (number < 0) 
{System.out.println("The number is Negative");} 

else 
{System.out.println("The number is Zero");}




}

}