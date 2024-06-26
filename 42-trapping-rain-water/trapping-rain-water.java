class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0)
            return 0;
        
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = height[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        
        right[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int water = 0;
        for (int i = 0; i < len; i++) {
            water += Math.max(Math.min(left[i], right[i]) - height[i], 0);
        }
        return water;
    }
}
