class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(int ele : set){
            int prev = ele - 1;
            if(!set.contains(prev)){
                int len = 1;
                int nextEle = ele + 1; 

                while(set.contains(nextEle)){
                    len++;
                    nextEle++;
                }
                maxLen = Math.max(maxLen,len);
            }    
        }
        return maxLen;
    }
}