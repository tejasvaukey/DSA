import static java.lang.Math.max;
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i = 0;
        int maxOnes = i;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == 1){
                i++;
                maxOnes = max(maxOnes, i);
            }
            if(arr[k] == 0){
                i = 0;
            }
        }
        return maxOnes;
    }
}