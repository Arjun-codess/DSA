class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0,j = nums.length-1;
        int k = j;

        int[] newArr = new int [nums.length];
        while(i < j){
            int iSq = nums[i] * nums[i];
            int jSq = nums[j] * nums[j];

            if(iSq > jSq){
                newArr[k--] = iSq;
                i++;
            }else{
                newArr[k--] = jSq;
                j--;
            }
        }
        newArr[0] = nums[i]*nums[i];
        return newArr;
        
    }
}