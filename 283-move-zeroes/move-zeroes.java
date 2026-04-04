class Solution {
    public void moveZeroes(int[] arr) {
        int j = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[j] == 0 && arr[i] != 0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            } else if(arr[j] != 0) j++;
            
        }
    }
}