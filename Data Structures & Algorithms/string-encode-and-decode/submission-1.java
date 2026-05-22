class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s:strs){
            encoded.append(s.length()).append("#").append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
       int i=0;
       int j=0;
       while(i<str.length()){
        j=i;
        while(str.charAt(j)!='#'){
            j++;
        }
        int length = Integer.parseInt(str.substring(i,j));
        strs.add(str.substring(j+1, j+length+1));
        i = j+length+1;
       }
       return strs;
    }
}
