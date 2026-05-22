class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l =st.length();
        int i =0;
        int j;
        while(i<l/2){
            j = l-i-1;
            if(st.charAt(i)!=st.charAt(j)) return false;
            i++;
        }
        return true;
    }
}
