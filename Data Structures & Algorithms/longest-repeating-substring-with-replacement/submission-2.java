class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength =0;
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            int[] hash = new int[26];
            int maxf =0;
            for(int j=i;j<n;j++){
                hash[arr[j]-'A']++;
                maxf = Math.max(maxf,hash[arr[j]-'A']);
                int change = j-i+1-maxf;

                if(change<=k){
                    maxLength = Math.max(maxLength,j-i+1);
                }
                else{

                    break;
                }
            }
        }
        return maxLength;
    }
}
