package hero;

// final class => cannot be extended
public final class Heros {
  public static final int[] MAX_HP //
  = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};

  public static final int[] MAX_MP //
  = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};

  public static final int[] PHY_ATTACK //
  = new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

  public static final int[] PHY_DEFENSE //
  = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  public static final double[] MAX_EXP //
  = new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};

  public static final double[] EXP_GAINED //
  = new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};

  public static int idCounter = 0;

  // static method 通常放最底.
  public static int getMaxHp(int level) {
    if (level < 1 || level > MAX_HP.length) {
      return -1;    // 不尋常數據的處理方式
    }
    return MAX_HP[level - 1];
  }

  public static double calcAddedExp(int killedHeroLevel) {
    return EXP_GAINED[killedHeroLevel - 1];
  }





}
