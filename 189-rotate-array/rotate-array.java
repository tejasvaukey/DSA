class Solution {
    public static void reversePartOfArray(int[] arr, int s, int e){
        
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++; e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(n == 1) return;
        reversePartOfArray(nums, 0, n-1);
        reversePartOfArray(nums, 0, k-1);
        reversePartOfArray(nums, k, n-1);
    }
}