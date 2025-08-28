package hero;

public class Recurve extends Bow {          // Recurve 反曲之弓

  @Override
  public double getPhyAttack() {
    return Bows.PHY_ATTACK[0] [super.getLevel() - 1];
  }

  @Override
  public double getMagicAttack() {
    return Bows.MAG_ATTACK[0] [super.getLevel() - 1];
  }

  @Override
  public double getCriticalChance() {
    return 1.0;
  }

  public static void main(String[] args) {
    Hero hero = new Archer();
    // setWeapon() -> Hero            // not good, 因為 hero 可任意裝配任何武器
    // setBow() -> Archer
    // which design is better?
  }
  
}
