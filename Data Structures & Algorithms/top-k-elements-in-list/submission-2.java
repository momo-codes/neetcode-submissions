class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val: nums){
            if(!map.containsKey(val)){
                map.put(val,1);
            }
            else{
                map.put(val, map.get(val)+1);
            }
        }

        List<Integer>[] bucket = new ArrayList[nums.length +1];
        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }
        for(int key: map.keySet()){
            bucket[map.get(key)].add(key); 
        }
        List<Integer> temp = new ArrayList<>();
        int[] res = new int[k];

        for(int i= bucket.length-1; i>=0;i--){
            for(int val:bucket[i]){
                    temp.add(val);
            }
        }

        for(int i =k-1; i>=0;i--){
            res[i] = temp.get(i);
        }
        return res;
    }
}
