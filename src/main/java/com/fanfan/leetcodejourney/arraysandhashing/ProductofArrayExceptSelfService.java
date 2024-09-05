package com.fanfan.leetcodejourney.arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/9/5
 */
@Service
public class ProductofArrayExceptSelfService {

  /*
   *
   * 時間複雜度: O(N)
   * 空間複雜度: O(N)
   *
   * */
  public int[] productofArrayExceptSelf(int[] nums) {

    Map<Integer, Integer> leftMap = new HashMap<>();

    int leftProductValue = 1;
    for(int i = 0 ; i < nums.length ; i++){

      // num[0] 則 leftMapValue為1
      if(i == 0){
        leftMap.put(0, 1);
        continue;
      }
      leftProductValue = leftProductValue * nums[i-1];
      int value = leftProductValue;
      leftMap.put(i, leftProductValue);
    }

    Map<Integer, Integer> rightMap = new HashMap<>();

    int rightProductValue = 1;
    for(int i = nums.length-1 ; i >= 0 ; i--){
      // num[0] 則 rightMapValue為1
      if(i == nums.length-1){
        rightMap.put(nums.length-1, 1);
        continue;
      }
      rightProductValue = rightProductValue * nums[i+1];
      int value = rightProductValue;
      rightMap.put(i, rightProductValue);
    }


    int[] result = new int[nums.length];
    for (int i = 0 ; i < nums.length ; i++){

      result[i] = leftMap.get(i) * rightMap.get(i);
      System.out.println( result[i]);
    }


    return result;
  }


}
