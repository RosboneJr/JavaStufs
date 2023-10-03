public class AnimalAttack {
    private String attacktype;
    private int damage;

    public String getAttacktype() {
        return attacktype;
    }

    public int getDamage() {
        return damage;
    }

    public AnimalAttack(String attacktype, int damage) {
        this.attacktype = attacktype;
        this.damage = Math.max(1, damage);

    }
}
