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
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int[] ans = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            for(int j =queries[i][0];j<=queries[i][1];j++){
                if(isValid(words[j],set)){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}