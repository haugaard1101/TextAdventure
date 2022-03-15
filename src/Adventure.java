
import java.util.Scanner;

public class Adventure {
    private String input;
    private boolean keepPlaying = true;
    Scanner in = new Scanner(System.in);

    public void go() {
        Room room1 = new Room();
        room1.setRoomName("room1");
        room1.setDescription("You are in room 1");
        Room room2 = new Room();
        room2.setRoomName("room2");
        room2.setDescription("You are in room 2");
        Room room3 = new Room();
        room3.setRoomName("room3");
        room3.setDescription("You are in room 3");
        Room room4 = new Room();
        room4.setRoomName("room4");
        room4.setDescription("You are in room 4");
        Room room5 = new Room();
        room5.setRoomName("room5");
        room5.setDescription("You are in room 5");
        Room room6 = new Room();
        room6.setRoomName("room6");
        room6.setDescription("You are in room 6");
        Room room7 = new Room();
        room7.setRoomName("room7");
        room7.setDescription("You are in room 7");
        Room room8 = new Room();
        room8.setRoomName("room8");
        room8.setDescription("You are in room 8");
        Room room9 = new Room();
        room9.setRoomName("room9");
        room9.setDescription("You are in room 9");

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        room9.setNorth(room6);
        room9.setWest(room8);

        Room currentRoom = room1;

        while (keepPlaying) {
            System.out.println(currentRoom.getRoomName());
            System.out.println(currentRoom.getDescription());
            System.out.println("Which direction would you like to go?(North, South, East or West)");
            input = in.nextLine();
            System.out.println();

            if (input.equalsIgnoreCase("north")) {
                System.out.println("You chose to travel North");
                if (currentRoom.getNorth() == null) {
                    System.out.println("You cannot go that way");
                    System.out.println();
                } else
                    currentRoom = currentRoom.getNorth();
            } else if (input.equalsIgnoreCase("south")) {
                System.out.println("You chose to travel South");
                if (currentRoom.getSouth() == null) {
                    System.out.println("You cannot go that way");
                    System.out.println();
                } else
                    currentRoom = currentRoom.getSouth();
            } else if (input.equalsIgnoreCase("west")) {
                System.out.println("You chose to travel West");
                if (currentRoom.getWest() == null) {
                    System.out.println("You cannot go that way");
                    System.out.println();
                } else
                    currentRoom = currentRoom.getWest();
            } else if (input.equalsIgnoreCase("east")) {
                System.out.println("You chose to travel East");
                if (currentRoom.getEast() == null) {
                    System.out.println("You cannot go that way");
                    System.out.println();
                } else
                    currentRoom = currentRoom.getEast();
            } else if (input.equalsIgnoreCase("help")) {
                System.out.println("You can move in the following directions: North, South, East and West");
            } else if (input.equalsIgnoreCase("look")) {
                System.out.println(currentRoom.getDescription());
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing");
                keepPlaying = false;
            } else
                System.out.println("What you want is impossible");
        }
    }

    public static void main(String[] args) {

        new Adventure().go();

    }
}

