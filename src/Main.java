public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(100, 20, "FIREBALL"),
                new Medic(150, 8, "HEALING"),
                new Warrior(200, 15, "CRITS")};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic increase his healing power. Current value: " + medic.healPoints);
            }
        }
    }
}