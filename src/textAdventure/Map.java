package textAdventure;

public class Map {
    private Room startRoom;

    public Map(){
        createRooms();
    }

     void createRooms() {

        Room room1 = new Room();
        room1.setRoomName("House");
        room1.setDescription("""
                You are in your own house""");
        Room room2 = new Room();
        room2.setRoomName("Abandoned Town");
        room2.setDescription("""
                You walk into the abandoned town.
                It reminds you of all the people you lost last winter
                You got to move on!""");
        Room room3 = new Room();
        room3.setRoomName("Graveyard");
        room3.setDescription("""
                You arrive at the haunted graveyard.
                Luckily you are just a farmer
                So no need for battling the undead""");
        Room room4 = new Room();
        room4.setRoomName("Old Road");
        room4.setDescription("""
                You have reached the old road
                It's pretty boring""");
        Room room5 = new Room();
        room5.setRoomName("Lumberyard");
        room5.setDescription("""
                You've done it!
                You take as much firewood as you can carry
                Now get home and get warmed up""");
        Room room6 = new Room();
        room6.setRoomName("Highway");
        room6.setDescription("""
                You're at the highway
                Some hooded figures suddenly rush at you. They are robbers!
                But when they found out you have nothing of worth, they leave""");
        Room room7 = new Room();
        room7.setRoomName("Lake");
        room7.setDescription("""
                You pass the great lake
                It is completely frozen over""");
        Room room8 = new Room();
        room8.setRoomName("Forrest");
        room8.setDescription("""
                You have reached the forrest. You are close to the lumberyard""");
        Room room9 = new Room();
        room9.setRoomName("Castle");
        room9.setDescription("""
                You walk in the shadow of your lords castle
                It was abandoned after the last ork raid""");

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

        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }
}