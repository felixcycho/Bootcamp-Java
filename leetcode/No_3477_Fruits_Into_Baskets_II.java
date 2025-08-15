package leetcode;

public class No_3477_Fruits_Into_Baskets_II {
  public static void main(String[] args) {
        // int[] fruits, means given
        // Given fruits -> int[]  (quantity of fruits)
        // Given baskets -> int[] (quantity of baskets)
        // use two-tier for-loop
        // 包含 status 概念, 意思是一旦某個 basket 被佔據, 其他 fruit 則不得重覆佔據該 basket.
        // 不得用 sorting, 因為最大 fruit 未必一定佔據最大 basket.
    
    No_3477_Fruits_Into_Baskets_II solution = new No_3477_Fruits_Into_Baskets_II();
    int[] fruits = {2, 3, 4};
    int[] baskets = {4, 5, 1};
    System.out.println(solution.numOfUnplacedFruits(fruits, baskets));    // output the results

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int unplaced = 0;
        boolean[] usedBaskets = new boolean[baskets.length];    // to track used baskets. 
        
        for (int i = 0; i < fruits.length; i++) {
            boolean isFound = false;      // 每次開新 i for-loop, 都自動將 isFound 化零.)
            for (int j = 0; j < baskets.length; j++) {
                if (!usedBaskets[j] && fruits[i] <= baskets[j]) {
                    usedBaskets[j] = true;     // mark this baskets have been used
                    isFound = true;
                    break;
                }
            } 
            if (!isFound) {
                unplaced++;
            }
        }
        return unplaced;
    }
  }
}
