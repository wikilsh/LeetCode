//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9411 👎 0


import java.util.HashMap;

/**
 * 一次从数组中取值，target-nuns[i]的值如果在map中存在，就是存在值的位置和此位置的key的集合
 * 如果不存在，将i处的key，value加入到hashmap中。继续便利
 * HashMap.containsKey(key)  判断hash表中是否存在该key
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                indexs[0] = hashMap.get(nums[i]);
                indexs[1] = i;
                return indexs;
            }
            hashMap.put(target-nums[i],i);
        }
        return indexs;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
