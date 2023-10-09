import java.util.Scanner;

public class marks {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = s.nextLine();

            System.out.print("Enter marks for three exams:\n");
            int marks1 = s.nextInt();
            int marks2 = s.nextInt();
            int marks3 = s.nextInt();

            //Average
            int Average = (marks1 +marks2 + marks3)/3;
            System.out.print("\nAverage for " + name +" is " + Average + "marks\n");
        }
    }
    
}

