class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s = 0, e = 0;
        int maxOnes = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) count++;
            if(nums[i] != 1) count = 0;
            if(count >= maxOnes) maxOnes = count;
        }
        return maxOnes;
    }
}