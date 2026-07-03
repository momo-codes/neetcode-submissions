class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0;
        int j=0;
        int cust = 0;
        int ones=0;
        int more=0;
       for(int k=0;k<customers.length;k++){
            if(grumpy[k]==0){
                cust+=customers[k];   //10
            }
       }
       int max =cust;
       while(j<customers.length){
        int size = j-i+1;
        if(grumpy[j]==1){
            more+=customers[j];
        }
        if(size<minutes){
            j++;
            continue;
        }
        max = Math.max(max,cust+more);
        if(grumpy[i]==1){
            more-=customers[i];
        }
        i++;
        j++;
       }
       return max;
    }
}