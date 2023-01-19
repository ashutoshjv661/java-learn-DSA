/* https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Approach :
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

we do target - nums[i] (9-2 = 7) 
and check if its present in our map. 
if no then we add nums[i] to map.
then we iterate and repeat until we find .
if found we take value of that diff (from map which is index)

*/

import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = target - nums[i];
            if(map.containsKey(current)){
                ans[0] = map.get(current);
                ans[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}