package com.fanfan.leetcodejourney.arraysandhashing;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class TwoSumService {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }


  public int[] twoSumUseHashMap(int[] nums, int target) {

    // key:array[i] value:i
    Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
    tempMap.put(nums[0], 0);
    for (int i = 1 ; i < nums.length ; i++){

      tempMap.put(nums[i], i);

      int diff = target - nums[i];
      if (diff != nums[i] && tempMap.get(diff) != null){
        return new int[]{tempMap.get(diff), i};
      }

    }

    throw new IllegalArgumentException("No two sum solution");
  }





}
