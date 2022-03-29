package textAdventure;

public class Food extends Item {

    private int foodHealth;

    public int getFoodHealth() {
        return foodHealth;
    }

    Food(String name, String description, int foodHealth) {
        super(name, description);
        this.foodHealth=foodHealth;



    }




}
