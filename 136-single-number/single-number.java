class Solution {
    public int singleNumber(int[] nums) {
        int theNumber = 0;
        for(int i : nums){
            theNumber ^= i;
        }
        return theNumber;
    }
}