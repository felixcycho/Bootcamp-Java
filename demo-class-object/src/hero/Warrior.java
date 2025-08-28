package hero;

public class Warrior extends Hero {
  private static final int MY_ROLE = Heros.WARRIOR;

  private Sword sword;

  public Warrior() {
    super(Heros.MAX_HP[MY_ROLE][0], Heros.MAX_HP[MY_ROLE][0]);
  }

  public void setSword(Sword sword) {
    this.sword = sword;
  }

  public boolean isEquipped() {
    return this.sword != null;
  }

  public void levelUp() {
    super.levelUp(Heros.MAX_HP[MY_ROLE][super.getLevel()],
        Heros.MAX_MP[MY_ROLE][super.getLevel()]);
  }

  public void recoverHp() {
    super.setHp(Heros.MAX_HP[MY_ROLE][super.getLevel() - 1]);
  }

  public void recoverMp() {
    super.setHp(Heros.MAX_MP[MY_ROLE][super.getLevel() - 1]);
  }

  public void attack(Hero target) {
    Heros.attack(this, //
        target, //
        Heros.MAX_HP[MY_ROLE][super.getLevel()], //
        Heros.MAX_MP[MY_ROLE][super.getLevel()], //
        this.getPhyAttack(), //
        this.getPhyDefense());
  }

  public int getPhyAttack() {
    return Heros.PHY_ATTACK[MY_ROLE][super.getLevel() - 1];
  }

  public int getPhyDefense() {
    return Heros.PHY_DEFENSE[MY_ROLE][super.getLevel() - 1];
  }

}
