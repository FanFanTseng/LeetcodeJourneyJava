package com.fanfan.leetcodejourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/26
 */
@Service
public class GroupAnagramsService {

  /*
   *
   * 字元計數法
   * 時間複雜度: O(N*K) 其中 N 是字串陣列的長度，K 是字串的最大長度。計算字元頻率陣列需要 O(K) 的時間。
   * 空間複雜度: O(N*K) 用於存儲字符數組的額外空間。
   *
   * */
  public Set<Set<String>> groupAnagramsByCharCount(String[] s) {

    Map<String, Set<String>> resultMap = new HashMap<>();

    for(String t : s){

      int[] letterCount = new int[26];

      for (char c : t.toCharArray()){
        letterCount[(c - 'a')]++;
      }

      StringBuilder countString = new StringBuilder();
      for (int letter : letterCount) {
        countString.append(String.valueOf(letter));
      }

      String key = countString.toString();
      if (resultMap.containsKey(key)){
        resultMap.get(key).add(t);
      }else{
        resultMap.put(key,new HashSet<>());
        resultMap.get(key).add(t);
      }
    }

    Set<Set<String>> result = new HashSet<>();

    for(Set<String> value : resultMap.values()){
      result.add(value);
    }

    return result;
  }
}
