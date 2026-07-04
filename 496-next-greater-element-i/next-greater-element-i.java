class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        st.push(nums2[nums2.length -1]); 
        map.put(nums2[nums2.length - 1], -1);

        for( int i = nums2.length - 2; i >= 0; i--){
            if(nums2[i] < st.peek()){
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);
                continue;
            }
            while(!st.isEmpty() && st.peek() < nums2[i])
            st.pop();

            if(st.isEmpty()){
                st.push(nums2[i]);
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            }
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
            
        }
        return nums1;
    }
}