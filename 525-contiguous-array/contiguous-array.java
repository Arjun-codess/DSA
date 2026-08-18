class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int zero = 0;
        int one = 0;
        int maxLen = 0;
        mp.put(0,-1);
        for(int i =0 ; i < n ; i++){
            if(nums[i] == 0)zero++; else one++;

            int diff = zero - one;

            if(mp.containsKey(diff)){
                maxLen = Math.max(maxLen,i - mp.get(diff));
            }else{
                mp.put(diff,i);
            }
        }
        return maxLen;
    }
}