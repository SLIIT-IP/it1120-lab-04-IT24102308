import java.util.Scanner;
public class IT24102308Lab4Q3
{
     public static void main(String[] args) 
{
//Define Variables
double number;

//Input      
Scanner input = new Scanner(System.in);
System.out.print("Enter a number : ");
number = input.nextDouble();
String message = (number > 0) ? "The number is Positive" :(number < 0) ? "The number is Negative" :"The number is Zero";

System.out.println(message);


}
}

