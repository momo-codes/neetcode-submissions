class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n = position.length;
        double[] time = new double[speed.length];
        for(int i =0;i<n;i++){
            time[i] =(double)(target-position[i])/speed[i]; 
        }
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((position[i]<position[j]) && (time[i]<time[j])){
                    time[i]=time[j];    
                }
                if((position[i]>position[j]) && (time[i]>time[j])){
                    time[j]=time[i];
                }
            }
        }

        Set<Double> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(time[i]);
        }

        return set.size();
    }
}
