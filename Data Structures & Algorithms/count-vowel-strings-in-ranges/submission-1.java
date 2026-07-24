class Solution {
    public boolean isValid(String s,Set<Character> set){
        if(set.contains(s.charAt(0)) && set.contains(s.charAt(s.length()-1))){
            return true;
        } 
        else{
        return false;
        }
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> set = new HashSet<>();
        set.add('a');  set.add('e'); set.add('i');set.add('o');set.add('u');
        int[] ans = new int[queries.length];
        int[] prefix = new int[words.length];
        if(isValid(words[0],set)){
            prefix[0] =1;
        }
        for(int i= 1;i<words.length;i++){
            prefix[i] = prefix[i-1]+(isValid(words[i],set)?1:0);
        }
        for(int i = 0;i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            if(s ==0){
                ans[i]=prefix[e];
            }
            else{
                ans[i] = prefix[e]-prefix[s-1];
            }
        }
        return ans;
    }
}