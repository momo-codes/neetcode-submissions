class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i<n;i++){
            map.put(position[i],speed[i]);
        }

        Arrays.sort(position);
        int fleets =0;
        double time =0;
        for(int i=n-1;i>=0;i--){
             double tempTime = (double)(target-position[i])/map.get(position[i]);
            if(tempTime>time){
                time = tempTime;
                fleets++;
            }
        }
        return fleets;
    }
}
