class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0, end = nums.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if((mid  == 0 || nums[mid] > nums[mid-1]) && (mid == end || nums[mid] > nums[mid+1])) return mid;
            if(nums[mid] < nums[mid+1]) st = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}