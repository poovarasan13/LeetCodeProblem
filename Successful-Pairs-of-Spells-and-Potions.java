class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int max = 0; 
        for (int potion : potions){
            max = Math.max(max, potion); 
        }
        int[] check = new int[max + 1];
        int[] res = new int[spells.length];
        for (int potion : potions){
            check[potion]++; 
        }  
        for (int i = check.length - 2; i >= 0; i--){
            check[i] += check[i + 1]; 
        }
        for (int i = 0; i < spells.length; i++){
            long index = 0; 
            if (success % spells[i] != 0){
                index = success/spells[i] + 1;  
            } else {
                index = success/spells[i];
            }
            res[i] = index >= check.length ? 0 : check[(int) index]; 
        }
        return res; 
    }
}