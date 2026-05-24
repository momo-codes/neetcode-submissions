class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2)return false;

        int[] hash1 = new int[26];
        char[] arr = s2.toCharArray();
        int[] hash2 = new int[26];

        for(int var:s1.toCharArray()){
            hash1[var-'a']++;
        }

        for(int i=0;i<n1;i++){
                hash2[arr[i]-'a']++;
        }

        int i=0, j=n1-1;
        boolean isSame =true;
        while(j<n2){
            for(int k =0;k<26;k++){
                if(hash1[k]!=hash2[k]){
                        isSame =false;
                        break;
                }
            }
            if(isSame)return true;
            hash2[arr[i]-'a']--;
            i++;
            j++;
            if(j<n2){
            hash2[arr[j]-'a']++;}
            isSame =true;
        }
        return false;

    }
}
