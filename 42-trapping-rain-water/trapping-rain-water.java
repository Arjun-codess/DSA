// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         Stack<Integer> st = new Stack<>();
//         int [] nse = new int[n];
//         int [] pse = new int[n];
//         st.push(n-1);
//         nse[n-1] = n;
//         for(int i = n-2 ; i >= 0; i--){
//             while(st.size()>0 && height[st.peek()] >= height[i]){
//                 st.pop();
//             }
//             if(st.size() == 0) nse[i] = n;
//             else nse[i] = st.peek();
//             st.push(i);
//         }

//         while(st.size()>0) st.pop();

//         st.push(0);
//         pse[0] = -1;

//         for(int i = 1; i<= n-1; i++){
//             while(st.size()>0 && height[st.peek()] >=  height[i]){
//                 st.pop();
//         }
//         if(st.size() == 0) pse[i] = -1;
//             else pse[i] = st.peek();
//             st.push(i);
//         }

//         int max = -1;
//         for(int i = 0 ; i< n; i++){
//             int area = height[i]*(nse[i] - pse[i]-1);
//             max = Math.max(max,area);
//         }
//         return max;
//     }
// }

class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[i] > height[st.peek()]) {
                int bottom = st.pop();
                if (st.isEmpty()) break;

                int left = st.peek();
                int width = i - left - 1;
                int boundedHeight = Math.min(height[left], height[i]) - height[bottom];
                water += width * boundedHeight;
            }
            st.push(i);
        }
        return water;
    }
}