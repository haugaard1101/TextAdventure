package textAdventure;

import java.util.Random;

public class Map {
    private Room startRoom;
    Random random = new Random();

    public Map(){
        createRooms();
    }

     void createRooms() {

        Room room1 = new Room();
        room1.setRoomName("House");
        room1.setDescription("""
                You are in your own house""");
        Food apple = new Food("Apple", "A nice and juicy red apple", 10);
        room1.addItem(apple);
        Item axe = new Item("Axe","An old woodcutter axe. It is quite rusty, but it'll get the job done");
        room1.addItem(axe);
        RangedWeapon bow = new RangedWeapon("Bow","Your fathers hunting bow. It have served you well for many years"
                , random.nextInt((20-10)+1)+10, 8);
        room1.addItem(bow);


        Room room2 = new Room();
        room2.setRoomName("Abandoned Town");
        room2.setDescription("""
                You walk into the abandoned town.
                It reminds you of all the people you lost last winter
                You got to move on!""");
        Food hardtack = new Food("Hardtack"
                , "A stale, hard and flavourless cracker. You've always hated hardtack..",20);
        room2.addItem(hardtack);
        MeleeWeapon sword = new MeleeWeapon("Sword","""
                The sword consist of a long, straight blade, sharp-edged on one or both sides,
                with one end pointed and the other fixed in a hilt with the pommel reassembling a lion's head"""
                , random.nextInt((22-15)+1)+15);
        room2.addItem(sword);


        Room room3 = new Room();
        room3.setRoomName("Graveyard");
        room3.setDescription("""
                You arrive at the haunted graveyard.
                Luckily you are just a farmer
                So no need for battling the undead""");
        Item shield = new Item("Shield","A large wooden shield, fitted with a leather strap and a handle for your left arm");
        room3.addItem(shield);


        Room room4 = new Room();
        room4.setRoomName("Old Road");
        room4.setDescription("""
                You have reached the old road
                It's pretty boring""");
        Food rat = new Food("Rat","A somewhat recently deceased rat", -10);
        room4.addItem(rat);


        Room room5 = new Room();
        room5.setRoomName("Lumberyard");
        room5.setDescription("""
                You've done it!
                You take as much firewood as you can carry
                Now get home and get warmed up""");
        Food water = new Food("water", "Water", 15);
        room5.addItem(water);
        Item firewood = new Item("firewood","Firewood");
        room5.addItem(firewood);
        Item holyGrail = new Item("holy grail","Holy Grail");
        room5.addItem(holyGrail);


        Room room6 = new Room();
        room6.setRoomName("Highway");
        room6.setDescription("""
                You're at the highway
                Some hooded figures suddenly rush at you. They are robbers!
                But when they found out you have nothing of worth, they leave""");
        Food bread = new Food("bread", "Bread",10);
        room6.addItem(bread);


        Room room7 = new Room();
        room7.setRoomName("Lake");
        room7.setDescription("""
                You pass the great lake
                It is completely frozen over""");
        Food badEgg = new Food("BadEgg", "badegg",10);
        room7.addItem(badEgg);


        Room room8 = new Room();
        room8.setRoomName("Forrest");
        room8.setDescription("""
                You have reached the forrest. You are close to the lumberyard""");
        Food fish = new Food("fish", "Fish", 10);
        room8.addItem(fish);
        Item gold = new Item("gold","Gold");
        room8.addItem(gold);


        Room room9 = new Room();
        room9.setRoomName("Castle");
        room9.setDescription("""
                You walk in the shadow of your lords castle
                It was abandoned after the last ork raid""");
        Food bacon = new Food("bacon", "Bacon", 30);
        room9.addItem(bacon);

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