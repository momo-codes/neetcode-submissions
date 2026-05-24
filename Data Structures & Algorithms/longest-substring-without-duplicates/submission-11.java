class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0 || n==1) return n;

        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int i=0;
        int j=1;
        set.add(arr[i]);
        int res =1;
        while(j<n){
            if(!set.contains(arr[j])){
                set.add(arr[j]);
                res = Math.max(res, j-i+1);
                j++;
            }

            else{
                while(set.contains(arr[j])){
                    set.remove(arr[i]);
                    i++;
                }
            }
        }

        return res;
    }
}



// abcdcba        //set[d,c,b,a]  j= 7 n=7   res=4 i=3