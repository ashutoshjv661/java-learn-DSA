/*
https://leetcode.com/problems/contains-duplicate/  

Approach :
1. using map
2. using set : if size of set reduces then duplicate present
*/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }
            mp.put(nums[i],1);
        }
        return false;
    }
}