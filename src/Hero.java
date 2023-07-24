public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superPower;

    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }
}
