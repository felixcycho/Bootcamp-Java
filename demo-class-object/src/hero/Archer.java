package hero;

public class Archer extends Hero {
  private static final int MY_ROLE = Heros.ARCHER;
  private Bow bow;           // Recurve 反曲之弓 / Guinsoo 鬼索之弓

  // Archer Object has Hero Object inside
  public Archer() {
    super(Heros.MAX_HP[MY_ROLE][0], Heros.MAX_HP[MY_ROLE][0]);        // 唔寫等於寫咗, implicitly written -> empty constructor
  }

  public void setBow(Bow bow) {
    this.bow = bow;
  }

  public boolean isEquiped() {
    return this.bow != null;
  }

  public void levelUp() {
    super.levelUp(Heros.MAX_HP[MY_ROLE][super.getLevel()], Heros.MAX_MP[MY_ROLE][super.getLevel()]);
  }

  public void recoverHp() {
    super.setHp(Heros.MAX_HP[MY_ROLE][super.getLevel() - 1]);
  }

  public void recoverMp() {
    super.setMp(Heros.MAX_MP[MY_ROLE][super.getLevel() - 1]);
  }

  public void attack(Hero target) {
    Heros.attack(this, target, Heros.MAX_HP[MY_ROLE][super.getLevel()],
     Heros.MAX_MP[MY_ROLE][super.getLevel()], this.getPhyAttack(), this.getPhyDefense());
  }

  public int getPhyAttack() {
    return Heros.PHY_ATTACK[MY_ROLE][super.getLevel() - 1];
  }

  public int getPhyDefense() {
    return Heros.PHY_DEFENSE[MY_ROLE][super.getLevel() - 1];
  }
  
  public static void main (String[] args) {
    Archer archer = new Archer();
    Warrior warrior = new Warrior();
    Mage mage = new Mage();
  }
  

}
