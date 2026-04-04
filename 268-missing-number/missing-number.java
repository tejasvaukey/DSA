class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int reqSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int missing = reqSum - sum;
        return missing;
    }
}