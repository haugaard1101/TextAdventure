package textAdventure;

public class Map {
    private Room startRoom;

    public Map(){
        createRooms();
    }

     void createRooms() {

        Room room1 = new Room();
        room1.setRoomName("You are in your own house");
        room1.setDescription("");
        Food apple = new Food("apple", "A nice and juicy red apple", 10);
        room1.addItem(apple);
        Item axe = new Item("axe","An old woodcutter axe. It is quite rusty, but it'll get the job done");
        room1.addItem(axe);
        RangedWeapon bow = new RangedWeapon("bow","Your fathers hunting bow. It have served you well for many years", 15,8);
        room1.addItem(bow);


        Room room2 = new Room();
        room2.setRoomName("You are in abandoned town");
        room2.setDescription("""
                You walk into the abandoned town.
                It reminds you of all the people you lost last winter
                You got to move on!""");
        Food hardtack = new Food("hardtack"
                , "A stale, hard and flavourless cracker. You've always hated hardtack..",20);
        room2.addItem(hardtack);
        MeleeWeapon sword = new MeleeWeapon("sword","""
                The sword consist of a long, straight blade, sharp-edged on one or both sides,
                with one end pointed and the other fixed in a hilt with the pommel reassembling a lion's head""",20);
        room2.addItem(sword);


        Room room3 = new Room();
        room3.setRoomName("You enter a graveyard");
        room3.setDescription("""
                You arrive at the haunted graveyard.
                Luckily you are just a farmer
                So no need for battling the undead""");
        Item shield = new Item("shield", """
                A large wooden shield, fitted with a leather strap and a handle for your left arm
                The front is faded, but you can still make out a white lion with a blue background""");
        room3.addItem(shield);


        Room room4 = new Room();
        room4.setRoomName("You are walking on the old road");
        room4.setDescription("""
                You have reached the old road
                It's pretty boring""");
        Food rat = new Food("rat","A somewhat recently deceased rat", -10);
        room4.addItem(rat);


        Room room5 = new Room();
        room5.setRoomName("You have reached the lumberyard");
        room5.setDescription("""
                You've done it!
                You take as much firewood as you can carry
                Now get home and get warmed up""");
        Food waterskin = new Food("waterskin", "A small leather bag containing refreshing water", 15);
        room5.addItem(waterskin);
        Item firewood = new Item("firewood","Logs and branches seasoned, keeping it dry and perfect for burning");
        room5.addItem(firewood);


        Room room6 = new Room();
        room6.setRoomName("You are on the highway");
        room6.setDescription("""
                You're at the highway
                Some hooded figures suddenly rush at you. They are robbers!
                But when they found out you have nothing of worth, they leave""");


        Room room7 = new Room();
        room7.setRoomName("You are near the lake");
        room7.setDescription("""
                You pass the great lake
                It is completely frozen over""");
        Food fish = new Food("fish",
                """
        A freshly caught fish. It might be a catfish or a bluegill
        You don't know your fish..""", 10);
        room7.addItem(fish);

        Room room8 = new Room();
        room8.setRoomName("You just entered the forrest");
        room8.setDescription("""
                You have reached the forrest. You are close to the lumberyard""");
        Item goldpouch = new Item("gold pouch","A small leather pouch containing a few gold coins");
        room8.addItem(goldpouch);


        Room room9 = new Room();
        room9.setRoomName("You are near the castle");
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