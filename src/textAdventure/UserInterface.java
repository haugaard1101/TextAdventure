package textAdventure;

import java.util.Scanner;

public class UserInterface {

    final Scanner in = new Scanner(System.in);
    private String input;

    public void welcomeMessage() {
        System.out.println("""
                You wake up and winter has come early. You need to find firewood to keep you and your family warm.
                Hurry and find the lumberyard in the forrest before it's too late!""");
    }

    public String playerInput() {
        System.out.print("\nWhich direction would you like to go?(North, South, East or West): ");
        input = in.nextLine().trim();
        System.out.println();
        return input;
    }
}

