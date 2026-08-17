class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0;
        int suffix = 0;
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(suffix == prefix - suffix - nums[i]){
                return i;
            }
            suffix += nums[i];
        }
        return -1;
    }
}