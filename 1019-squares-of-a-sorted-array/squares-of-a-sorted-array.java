class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0; int right = nums.length -1;
        int k = right;
        int[] newArr = new int[nums.length];
        while(left < right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                newArr[k--] = leftSq;
                left++;
            }else{
                newArr[k--] = rightSq;
                right--;
            }
        }
        newArr[0] = nums[left]*nums[left];
        return newArr;
    }
}


