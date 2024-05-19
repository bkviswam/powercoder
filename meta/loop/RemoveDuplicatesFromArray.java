package meta.loop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2, 3,4,4,5,5,6,7};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    private static int[] removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int[] resp = new int[map.size()];
        int count = 0;
        for(Integer keySet : map.keySet()){
            resp[count++] = keySet;
        }
        return resp;
    }
}
