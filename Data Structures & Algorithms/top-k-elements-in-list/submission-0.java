class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> (map.get(a) - map.get(b)));
        
        for(int key: map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int j=0; j<k; j++){
            result[j] = pq.poll();
        }

        return result;
        
    }
}
