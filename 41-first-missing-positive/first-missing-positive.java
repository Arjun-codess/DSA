class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(i == 0)continue;
            set.add(i);
        }
        int i = 1;
        while(true){
            if(!set.contains(i)) return i;
        i++;
        }

    }
}