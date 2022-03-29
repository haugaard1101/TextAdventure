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
    public void whereToGo(){
        System.out.print("\nWhich direction would you like to go?(North, South, East or West): ");
    }

    public String playerInput() {
        input = in.nextLine().trim();
        return input;
    }
    public void health(Player player){
        System.out.println("Your current health is at: " + player.getHealth());
        if(player.getHealth() >= 100){
            System.out.println("You're in perfect health!");
        }
        else if(player.getHealth() < 100 && player.getHealth() >= 75){
            System.out.println("You're doing pretty good. Keep going.");
        }
        else if(player.getHealth() < 75 && player.getHealth() >= 25){
            System.out.println("You're starting to look pretty banged up. You should eat some.");
        }
        else
            System.out.println("Jesus! You're almost dead! Get some food quick!");
    }
}

