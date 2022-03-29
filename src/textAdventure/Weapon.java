package textAdventure;

public class Weapon extends Item {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;

    }
}
