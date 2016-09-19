package lecode.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sfeng on 2016/9/18.
 */

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution.

        Example:
        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1]*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numss=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(numss.get(target-nums[i])!=null){
                int[] res={numss.get(target-nums[i]),i};
                return res;
            }

            numss.put(nums[i],i);
        }
        return new int[2];

    }
}
