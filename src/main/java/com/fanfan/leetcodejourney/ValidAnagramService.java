package com.fanfan.leetcodejourney;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 給定兩個字串 s 和 t，如果 t 是 s 的 Anagram，則返回 true，否則返回 false。
 * Anagram 是通過重新排列不同單詞或短語的字母形成的單詞或短語，通常恰好使用所有原始字母一次。
 *
 */
@Service
public class ValidAnagramService {


  /*
   *
   * 時間複雜度: O(NlogN)
   * 空間複雜度: O(n) 用於存儲字符數組的額外空間。
   *
   * */
  public boolean ValidAnagramWithSort(String s, String t) {

    if (s.length()!=t.length()){
      return false;
    }

    // 將 String 轉換成 char 陣列
    char[] charArray = s.toCharArray();
    // 對 char 陣列進行排序
    Arrays.sort(charArray);
    // 將排序後的 char 陣列轉換回 String
    String sortedStr = new String(charArray);

    // 將 String 轉換成 char 陣列
    char[] charArray2 = t.toCharArray();
    // 對 char 陣列進行排序
    Arrays.sort(charArray2);
    // 將排序後的 char 陣列轉換回 String
    String sortedStr2 = new String(charArray2);

    return sortedStr.equals(sortedStr2);
  }

  /*
   *
   *通過計算每個字母在兩個字串中出現的次數來檢查它們是否為 Anagram
   *
   * 時間複雜度: O(N)，遍歷兩個字串的時間。
   * 空間複雜度: O(1)
   *
   * 總結來說，HashMap 適合更通用的場景，但如果你確定輸入僅包含小寫字母且對空間敏感，使用固定大小的數組會更高效。
   * */
  public boolean ValidAnagramWithCount(String s, String t) {

    // 如果長度不同，直接返回 false
    if (s.length() != t.length()) {
      return false;
    }

    // 使用 HashMap 記錄每個字元的出現次數
    HashMap<Character, Integer> countMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      // 增加 s 中字元的計數
      countMap.put(charS, countMap.getOrDefault(charS, 0) + 1);
      // 減少 t 中字元的計數
      countMap.put(charT, countMap.getOrDefault(charT, 0) - 1);
    }

    // 檢查所有字元的計數是否都為零
    for (int count : countMap.values()) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }



}
