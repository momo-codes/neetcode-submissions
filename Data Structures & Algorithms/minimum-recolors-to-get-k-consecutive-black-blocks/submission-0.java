class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int count=0;
        int size = 0;
        int min =blocks.length();
        while(j<blocks.length()){
            if(blocks.charAt(j)=='W'){
                count++;
            }
            size = j-i+1;
            if(size==k){
                min = Math.min(count,min);
                if(blocks.charAt(i)=='W'){
                    count--;
                }
                i++;
            }
            j++;
        }
        return min;
    }
}