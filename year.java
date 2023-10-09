import java.util.Scanner;

public class year {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year:");
        String year = s.nextLine();

        if (year%4) {
            System.out.print("Leap year");
        }else {
            System.out.print("Not leap year");
        }

    }
}