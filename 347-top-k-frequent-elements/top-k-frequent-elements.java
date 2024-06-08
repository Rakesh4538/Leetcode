class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i< nums.length;i++)
        {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i],1);
            }

        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a)); //Sorting the list in descending order using List.sort with a comparator

        int result[] = new int[k];
        int index = 0;
        for(int i = 0; i < k; i++) {
            result[index] = list.get(i);
            index++;
        }
        return result;
    

        
    }
}