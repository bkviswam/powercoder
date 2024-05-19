package meta;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int [] nums = new int[]{1, 2, 3};
        int k = 3;
        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
        System.out.println("The number of sub arrays : "+subArraySumEqualsK.subArraySum(nums, k));

    }

    private int subArraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
