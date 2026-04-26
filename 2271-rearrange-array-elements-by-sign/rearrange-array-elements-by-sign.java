class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n];
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int idx = 0;;
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > 0) positive[idx++] = nums[i];
            else negative[j++] = nums[i];
        }
        idx = 0; j = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                newNums[i] = positive[idx++];
            } 
            else {
                newNums[i] = negative[j++]; 
            }
        }
        return newNums;
    }
}