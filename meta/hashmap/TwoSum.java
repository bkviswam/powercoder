package meta.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums  = new int[] {3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        System.out.println("Index of the numbers in the array adds sup to the target : "+Arrays.toString(twoSum.twoSum(nums, target)));
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }else{
                map.put(target - nums[i], i);
            }
        }
        return new int [] {};
    }
}
