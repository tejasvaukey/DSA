class Solution {
    public int majorityElement(int[] nums) {
        int element = -1;
        int hn = nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
            if(count > hn) element = nums[i];
        }
        return element;
    }
}