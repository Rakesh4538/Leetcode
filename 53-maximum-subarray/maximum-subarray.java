class Solution {
    public int maxSubArray(int[] num) {

        int sum = 0;
        int max = num[0];

        for(int i = 0;i < num.length;i++)
        {
            sum += num[i];
            max = Math.max(sum,max);

            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }
}