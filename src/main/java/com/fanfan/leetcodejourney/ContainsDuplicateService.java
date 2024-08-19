package com.fanfan.leetcodejourney;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/19
 */
@Service
public class ContainsDuplicateService {

  /*
  *
  * 時間複雜度: O(N)
  * 空間複雜度: O(N)
  *
  * */
  public boolean ContainsDuplicateWithSet(int[] nums) {

    Set<Integer> numsSet = new HashSet<>();

    for (int i : nums){
      if(!numsSet.add(i)) {
        return true;
      }

    }
    return false;
  }


  /*
   *
   * 時間複雜度: O(NlogN)
   * 空間複雜度: O(1)
   *
   * */
  public boolean ContainsDuplicateWithSort(int[] nums) {

    // 排序 (Timesort 排序演算法)
    Arrays.sort(nums);

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }

}
