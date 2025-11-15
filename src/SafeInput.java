import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean valid = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt >= low && retInt <= high) {
                    valid = true;
                } else {
                    System.out.println("Input is out of range enter a number between " + low + " and " + high);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid whole number try again");
            }
        }
        while (!valid);
        return retInt;
    }
}
