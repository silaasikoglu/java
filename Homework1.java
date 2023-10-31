import java.util.*;
public class Homework1 {
    public static void main(String[] args) {

        // Read student's age
        int studentsage;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's age:");
        studentsage = input.nextInt();

        if (studentsage>=18) {
            System.out.println("You're old!");
        }
        else {
            System.out.println("You're young!");

        }

    }
}
