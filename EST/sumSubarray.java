package EST;

import java.util.HashMap;
import java.util.Map;

class sumSubarray {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum = 0 occurs once

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if a previous prefixSum existed so that:
            // previousPrefix = prefixSum - k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store the prefix sum in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
