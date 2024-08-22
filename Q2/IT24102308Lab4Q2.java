import java.util.Scanner;

public class IT24102308Lab4Q2 {
    public static void main(String[] args) {
        // Define Variables
        double exammarks;
        double labmarks;
        double finalmarks;
        double exampercentage;
        double labpercentage;

        Scanner input = new Scanner(System.in);

        // Exam marks
        System.out.print("Please enter the exam marks (out of 100): ");
        exammarks = input.nextDouble();
        if (exammarks<0||exammarks>100) 
        {
            System.out.println("Invalid input for the exam marks. Terminating program.");
            return; 
        }

        // Lab marks
        System.out.print("Please enter the lab marks (out of 100): ");
        labmarks = input.nextDouble();
        if (labmarks<0||labmarks>100)
        {
            System.out.println("Invalid input for the lab marks. Terminating program.");
            return; 
        }

        // Exam Percentage
        System.out.print("Please enter percentage given for the exam: ");
        exampercentage = input.nextDouble();
        if (exampercentage<0||exampercentage>100) 
        {
            System.out.println("Invalid input for the exam percentage. Terminating program.");
            return; 
        }

        // Lab Percentage
        System.out.print("Please enter percentage given for the lab submission: ");
        labpercentage = input.nextDouble();
        if (labpercentage<0||labpercentage>100) 
        {
            System.out.println("Invalid input for the lab percentage. Terminating program.");
            return; 
        }

        if (exampercentage+labpercentage!=100) 
        {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return; 
        }

        // Final marks Calculation
        finalmarks = (exammarks*exampercentage/100)+(labmarks*labpercentage/100);
        System.out.println("The final mark is: " +finalmarks);
    }
}
