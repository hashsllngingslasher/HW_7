public class Medic extends Hero{
    public int healPoints = 10;
    public void increaseExperience(){
        healPoints += healPoints*0.1;
    }
    public Medic(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used a superpower " + superPower);

    }
}
