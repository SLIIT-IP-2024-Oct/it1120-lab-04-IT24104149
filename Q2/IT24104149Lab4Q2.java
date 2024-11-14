import java.util.Scanner;

public class IT24104149Lab4Q2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int examMarks = -1;
        while (examMarks < 0 || examMarks > 100) 
        {
            System.out.print("Enter the exam marks (out of 100): ");
            examMarks = scanner.nextInt();
            if (examMarks < 0 || examMarks > 100) 
            {
                System.out.println("Invalid input for the exam marks. Terminating program.");
            }
        }
        
        int labMarks = -1;
        while (labMarks < 0 || labMarks > 100) 
        {
            System.out.print("Enter the lab submission marks (out of 100): ");
            labMarks = scanner.nextInt();
            if (labMarks < 0 || labMarks > 100) 
            {
                System.out.println("Invalid input for the lab marks. Terminating program.");
            }
        }
        
        int examPercentage = -1;
        while (examPercentage < 0 || examPercentage > 100) 
        {
            System.out.print("Enter the percentage given for the exam: ");
            examPercentage = scanner.nextInt();
            if (examPercentage < 0 || examPercentage > 100) 
            {
                System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
            }
        }
        

        int labPercentage = -1;
        while (labPercentage < 0 || labPercentage > 100) 
        {
            System.out.print("Enter the percentage weight for lab submission marks: ");
            labPercentage = scanner.nextInt();
            if (labPercentage < 0 || labPercentage > 100) 
            {
                System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
            }
        }
        
       
        if (examPercentage + labPercentage != 100) 
        {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMarks = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
     
        System.out.println("\nFinal exam marks is: " + finalMarks);
        
        scanner.close();
    }
}
