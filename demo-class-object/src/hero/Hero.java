package hero;
import java.math.BigDecimal;

public abstract class Hero {

  // Max HP 雖然會變動, 但只隨著 level 變動, 所以不會 defined as attribute.
  // Instead, Max HP 則只需靠算式, 去 calculate result.
  // static final int[] 意指 fixed.
  // 全大楷表達
  // But, if 預計將來需要更改, 則不建議用 static final int[].
  // static constructor 會放最頂.
  // private static final int[] MAX_HP //
  // = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};

  // private static final int[] MAX_MP //
  // = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};

  // private static final int[] PHY_ATTACK //
  // = new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

  // private static final int[] PHY_DEFENSE //
  // = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  // private static final double[] MAX_EXP //
  // = new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};

  // private static final double[] EXP_GAINED //
  // = new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};

  private static int idCounter = 0;

  // state or attribute
  private int hp;    // hp 會變動, 所以需要 define as attribute.
  // Attribute 本義, 是用於儲存位置.
  // Otherwise, if hp is static, no need to define as attribute,
  // static value just called by static method is OK.
  private int mp;
  private int level;
  private double exp;
  private int id;
  // private String role;        
  // Hero 與生俱來, 不可能沒有職業, 亦不可捨棄 / 卸下職業, 所以最好不放 role 在 
  // private Weapon weapon;       // 此句顯示 developer 忽略各武器只能裝配各勇士的事實
  // private Bow bow;             // 此句雖可接受, 但最好另加 Classes Bow, Sword, Stave.
  // private Sword sword;
  // private Stave stave;
  
  // Constructor
  public Hero(int maxHp, int maxMp) {      // Parameters: maxHp, maxMp
  // In this case, if id is used as parameter, it means that user may decide the id by himself.
    this.id = ++idCounter;
    this.level = 1;
    this.hp = maxHp;        
    this.mp = maxMp;        
    this.exp = 0.0;
  }

  // Setter
  public void levelUp(int maxHp, int maxMp) {
    this.level++;
    this.hp = maxHp;
    this.mp = maxMp;
    this.exp = 0.0;
  }

  // Setter
  public void setHp(int hp) {
    this.hp = hp;
  }

  // Setter
  public void setMp(int mp) {
    this.mp = mp;
  }

  // Setter
  public void setExp(double exp) {
    this.exp = exp;
  }
  // Setter
  public void recoverHp(int hp) {
    this.hp = hp;
  }

  // Setter
  public void recoverMp(int mp) {
    this.mp = mp;
  }

  // Setter
  public void deductHp(int deductedHp) {
    // if (this.hp >= deductedHp) {
    //   this.hp = this.hp - deductedHp;
    // } else {
    //   this.hp = 0;
    // }
    this.hp = Math.max(this.hp - deductedHp, 0);    // Math.max 用於兩者取其大數.
  }

  // Getter
  public int getLevel() {
    return this.level;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  // public int getPhyAttack() {
  //  return Heros.PHY_ATTACK[this.level - 1];
  // this setter cannot be defined as static, because 有 this.level
  // }

  // public int getPhyDefense() {
  //  return Heros.PHY_DEFENSE[this.level - 1];
  // this setter cannot be defined as static, because 有 this.level
  // }
  
  public double getExp() {
    return this.exp;
  }

  public boolean isAlive() {
    return this.hp > 0;
    // 如果寫 == 0, 則會有大 bug.
    // If 反轉寫, 則 this.hp <= 0;
  }

  // instance method can call static things..
  public int getMaxHp() {
    return Heros.getMaxHp(Heros.getRole(this), this.level);
  }

  // Getter
  public int getId() {
    return this.id;
  }

  // Getter
  public boolean equals(Hero hero) {
    return this.id == hero.getId();
  }

  // static method 通常放最底.
  // public static int getMaxHp(int level) {
  //  if (level < 1 || level > MAX_HP.length) {
  //    return -1;    // 不尋常數據的處理方式
  //  }
  //  return MAX_HP[level - 1];
  // }

  // public static double calcAddedExp(int killedHeroLevel) {
  //  return EXP_GAINED[killedHeroLevel - 1];
  // }

  public static void main(String[] args) {
  //  Hero h1 = new Hero();                      invalid, because Hero class is abstracted.
    Warrior h1 = new Warrior();
    System.out.println(h1.getLevel());
    System.out.println(h1.getPhyAttack());
    System.out.println(h1.getHp());
    System.out.println(h1.getMaxHp());
    System.out.println(h1.isAlive());

    Archer h2 = new Archer();
    System.out.println(h2.getLevel());
    System.out.println(h2.getPhyAttack());
    System.out.println(h2.getHp());
    System.out.println(h2.getMaxHp());
    System.out.println(h2.isAlive());

    h1.attack(h2);
    System.out.println(h1.getHp());
    System.out.println(h2.getHp());
    System.out.println(h2.isAlive());

    h1.attack(h2);
    System.out.println(h2.getHp());
    System.out.println(h2.isAlive());

    // h1 = h2;         // to release the RAM / memory used.

  }
}
