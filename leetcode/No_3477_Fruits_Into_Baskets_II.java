package leetcode;

public class No_3477_Fruits_Into_Baskets_II {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // int[] fruits, means given
        // Given fruits -> int[]  (quantity of fruits)
        // Given baskets -> int[] (quantity of baskets)
        // use two-tier for-loop
        // 包含 status 概念, 意思是一旦某個 basket 被佔據, 其他 fruit 則不得重覆佔據該 basket.
        // 不得用 sorting, 因為最大 fruit 未必一定佔據最大 basket.
        
        int unplaced = 0;
        
        for (int i = 0; i < fruits.length; i++) {
            boolean isFound = false;      // 每次開新 i for-loop, 都自動將 isFound 化零.)
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    baskets[j] = 0;
                    isFound = true;
                    break;
                }
            } 
            if (isFound == false) {
                unplaced++;
            }
        }
        return unplaced;
    }
}
