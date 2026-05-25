class Solution {
    public int[] dailyTemperatures(int[] temperatures) {        //[55,38,53,81,61,93,97,32,43,78]  n=10
        int i=0;                                                //[3,1,1,2,1,1,0,0,1,0]
        int j=1;
        int[] res = new int[temperatures.length];
         while(j<temperatures.length){                             //7
            if(temperatures[j]>temperatures[i]){
                res[i] = j-i;
                i++;
                j=i+1;
            }
            else{
                j++;
                if(j==temperatures.length){
                    res[i]=0;
                    i++;
                    j=i+1;
                }
            }
         }
         return res;
    }
}
