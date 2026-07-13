class Solution {
    public int singleNumber(int[] nums) {
        int o = 0;
        int t = 0;
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            o = (o^nums[i]) & ~t;
            t = (t^nums[i]) & ~o;
        }
    return o;
    }
}