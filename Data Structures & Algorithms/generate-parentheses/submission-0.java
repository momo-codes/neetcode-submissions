class Solution {
    public void backtrack(StringBuilder sb,List<String> res, int n,int count1,int count2){
        if(sb.length() == 2*n){
            res.add(sb.toString());
            return;
        }
        if(count1<n){
            sb.append('(');
            backtrack(sb,res,n,count1+1,count2);
            sb.setLength(sb.length()-1);
        }
        if(count2<n && count2<count1){
            sb.append(')');
            backtrack(sb,res,n,count1,count2+1);
            sb.setLength(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        backtrack(sb,res,n,0,0);
        return res;
    }
}
