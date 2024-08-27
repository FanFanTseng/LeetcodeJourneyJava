package com.fanfan.leetcodejourney;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/28
 */
@Service
public class LongestConsecutiveSequenceService {

  /*
   *
   * 字元計數法
   * 時間複雜度: O(N)
   * 空間複雜度: O(N)
   *
   * */
  public int longestConsecutiveSequenceBySet(int[] input) {

    Set<Integer> tempSet = new HashSet<>();
    for(int a : input){
      tempSet.add(a);
    }

    int count = 0;
    for(int a : input){
      if(tempSet.contains(a + 1)){
        count++;
      }
    }

    if (count > 0){
      count ++;
    }
    return count;
  }


}
