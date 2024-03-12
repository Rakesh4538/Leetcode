class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) 
            set.add(n);
        
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num - 1)) continue;

            int currLen = 0;
            while (set.contains(num)) {
                currLen += 1;
                num += 1;
            }

            max = Math.max(max, currLen);
        }
        return max;
    }
}
