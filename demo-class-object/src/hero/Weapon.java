package hero;

public abstract class Weapon {
  abstract double getPhyAttack();
  abstract double getMagicAttack();
  abstract double getCriticalChance();


  public static void main(String[] args) {
    int[][] heroValueMap = new int[3][10];     // 3 個 roles, 10 個 level
    int[][] heroPhyAttackMap = new int[3][10];
    int[][] heroMagicAttackMap = new int[3][10];
    int[][] heroCriticalChanceMap = new int[3][10];
    // Warrior
    heroPhyAttackMap[0] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
    // Archer
    heroPhyAttackMap[0] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
    // Maze
    heroMagicAttackMap[0] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
  }


}
