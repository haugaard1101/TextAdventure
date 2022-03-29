package textAdventure;

public class RangedWeapon extends Weapon{
    private int ammo;

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    RangedWeapon(String name, String description) {
        super(name, description);
    }
}
