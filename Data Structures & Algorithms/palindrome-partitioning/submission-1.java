class Solution {
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void backtrack(List<List<String>> res, int start,String s,List<String> tempSet){
        if(start==s.length()){
            res.add(new ArrayList<>(tempSet));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(i>start){
                if(!isPalindrome(s.substring(start,i+1))){
                    continue;
                }
            }
            tempSet.add(s.substring(start,i+1));
            backtrack(res,i+1,s,tempSet);
            tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res =  new ArrayList<>();
        backtrack(res,0,s,new ArrayList<>());
        return res;
    }
}
