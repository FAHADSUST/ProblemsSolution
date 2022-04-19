package leetcode;

//https://leetcode.com/problems/maximum-subarray/submissions/

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int startWind=0, endWind=0;
        int sum=0;
        int max = Integer.MIN_VALUE;

        for(endWind=0; endWind<nums.length; endWind++)
        {
            sum+=nums[endWind];

            while(sum < nums[endWind])
            {
                sum-=nums[startWind];
                startWind++;

            }

            max = Math.max(max, sum);
        }

        return max;

    }
}
