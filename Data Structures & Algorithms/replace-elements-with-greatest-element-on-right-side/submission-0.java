class Solution {
    public int[] replaceElements(int[] arr) {
         Deque<Integer>st = new ArrayDeque<>();
         for(int i = 0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                st.push(i);
            }
         }
         int [] ans = new int[arr.length];
         ans[arr.length-1] = -1;
         int min = st.pop();
         for(int i = arr.length-2;i>=0;i--){
            if(!st.isEmpty() && st.peek()>i){
                min = st.pop();
            }
            ans[i] = arr[min];
         }

         return ans;
    }
}