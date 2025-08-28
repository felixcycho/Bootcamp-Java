package hero;

public class Mage extends Hero {
  private static final int MY_ROLE = Heros.MAGE;

  private Stave stave;

  public Mage() {
    super(Heros.MAX_HP[MY_ROLE][0], Heros.MAX_HP[MY_ROLE][0]);
  }

  public void setSword(Stave stave) {
    this.stave = stave;
  }

  public boolean isEquipped() {
    return this.stave != null;
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
        this.getMagicAttack(), //
        target.getMagicDefense());
  }

  public int getMagicAttack() {
    return Heros.MAG_ATTACK[MY_ROLE][super.getLevel() - 1];
  }

  public int getPhyDefense() {
    return Heros.PHY_DEFENSE[MY_ROLE][super.getLevel() - 1];
  }

  public int getMagDefense() {
    return Heros.MAG_DEFENSE[MY_ROLE][super.getLevel() - 1];
  }
}
