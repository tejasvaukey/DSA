class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i = 0;
        int maxOnes = i;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == 1){
                i++;
            }
            if(arr[k] == 0){
                i = 0;
            }
            if(i > maxOnes) maxOnes = i;
        }
        return maxOnes;
    }
}