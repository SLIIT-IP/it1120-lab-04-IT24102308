import java.util.Scanner;
public class IT24102308Lab4Q2
{
     public static void main(String[] args) 
{
//Define Variables
double exammarks;
double labmarks;
double finalmarks;
double exampercentage;
double labpercentage;

Scanner input = new Scanner(System.in);


//Exam marks
do
{
      System.out.print("Please enter the exam marks (out of 100): ");
      exammarks= input.nextDouble();

      if (exammarks<0||exammarks>100)
      {System.out.println("Invalid input for the exam marks.Terminating program ");} 
}
     while
(exammarks<0||exammarks>100);



//Lab marks
do
{
    System.out.print("Please enter the lab marks (out of 100): ");
    labmarks= input.nextDouble();

    if (labmarks<0||labmarks>100)
    {System.out.println("Invalid input for the lab marks.Terminating program ");} 
}
    while
(labmarks<0||labmarks>100);



//Exam  Percentage
do
{
    System.out.print("Please enter percentage given for the exam  : ");
    exampercentage= input.nextDouble();

    if (exampercentage<0||exampercentage>100)
    {System.out.println("Invalid input for the exam percentage.Terminating program ");} 
}
    while
(exampercentage<0||exampercentage>100);



//Lab  Percentage
do
{
    System.out.print("Please enter percentage given for the lab submission : ");
    labpercentage= input.nextDouble();

    if (labpercentage<0||labpercentage>100)
    {System.out.println("Invalid input for the lab percentage.Terminating program ");} 
}

   while
(labpercentage<0||labpercentage>100);


if
   (exampercentage+labpercentage!=100)
   {System.out.println("The percentages must add up to 100.Terminating program ");} 

else
  { finalmarks = (exammarks * exampercentage / 100) + (labmarks * labpercentage / 100);
   System.out.println("The final mark is: " +finalmarks);
  }

}
}

