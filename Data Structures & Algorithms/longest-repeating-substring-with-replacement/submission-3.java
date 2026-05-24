//optimal

class Solution {
    public int characterReplacement(String s, int k) {
           int n = s.length();
            int i=0, j=0;
            int[] hash  = new int[26];
            char[] arr = s.toCharArray();
            int maxf = 0;
            int maxl=0;
            boolean isChanged =true;
            while(j<n){
                if(isChanged){hash[arr[j]-'A']++;}
                maxf = Math.max(hash[arr[j]-'A'],maxf);
                int change = j-i+1-maxf;
                if(change  <=k){
                    maxl = Math.max(maxl,j-i+1);
                    j++;
                    isChanged=true;
                }
                else{
                    hash[arr[i]-'A']--;
                    i++;
                    isChanged = false;
                    for(int x=0;x<26;x++){
                        maxf= Math.max(maxf,hash[x]);
                    }
                }
            }
            return maxl;

    }
}
