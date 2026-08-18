class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int prefix =0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i< nums.length; i++){

            prefix += nums[i];
            int rem = prefix % k;
            if(rem < 0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
                map.put(rem,map.getOrDefault(rem,0) +1); 
            }else{
                map.put(rem,1);
            }
            
        }
        return count;

    }
}