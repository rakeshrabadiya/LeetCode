class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        
        int k = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int max = 0;
            int count = 0;
            for(int j = 0; j < n ; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            if(count>max){
                max = count;
                arr[k++] = max;
            }else if(count == 0){
                arr[k++] = count;
            }
        }
        return arr;
    }
}