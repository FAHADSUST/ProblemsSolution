package leetcode;

//https://leetcode.com/problems/3sum/submissions/
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        int startWind = 0, endWind=0;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int k=3;

        for(int i=0; i<nums.length; i++)
        {
            startWind=i+1;
            endWind = nums.length-1;

            while(startWind<endWind)
            {
                int sum = nums[i]+nums[startWind]+nums[endWind];
                if(sum ==0)
                {
                    List<Integer> numsList = new ArrayList<>();
                    numsList.add(nums[i]);
                    numsList.add(nums[startWind]);
                    numsList.add(nums[endWind]);
                    if(map.get(numsList)==null)
                    {
                        res.add(numsList);
                        map.put(numsList, 1);
                    }

                    startWind++;
                }else if(sum > 0)
                {
                    endWind--;
                } else {
                    startWind++;
                }
            }
        }

        return res;
    }
}
