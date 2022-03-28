package textAdventure;

public class Food extends Item {


    public int getFoodHealth() {
        return foodHealth;
    }
    private int foodHealth;

    Food(String name, String description, int foodHealth) {
        super(name, description);
        this.foodHealth=foodHealth;



    }




}
