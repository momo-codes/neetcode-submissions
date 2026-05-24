class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String str1 = new String(arr1);
        int n1 =arr1.length;

      
        
        for(int i=0;i<=s2.length()-n1;i++){
                 String str2 = s2.substring(i,i+n1);
                 
                 char[] arr2 = str2.toCharArray();
                 Arrays.sort(arr2);
                 String sorteds2 = new String(arr2);

                 if(sorteds2.equals(str1))return true;
        }

        return false;
    }
}
