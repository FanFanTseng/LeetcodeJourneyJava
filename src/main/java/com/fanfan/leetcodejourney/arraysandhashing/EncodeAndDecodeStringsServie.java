package com.fanfan.leetcodejourney.arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/9/12
 */
@Service
public class EncodeAndDecodeStringsServie {


  /*
   * 題目用意在 "Escaping"，將字元透過轉義
   * 時間複雜度: O(N)
   * 空間複雜度: O(N)
   * */
  public String encode(List<String> input) {

    StringBuffer encodeString = new StringBuffer();

    for(String str : input){
      String escapedStr = str.replace("$","$$");
      encodeString.append(str.length()).append("$").append(escapedStr);
    }

    return encodeString.toString();
  }

  /* $Hello$world$$
   * 時間複雜度: O(N)
   * 空間複雜度: O(N)
   * */
  public List<String> decode(String encodeString) {

    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < encodeString.length()) {
      // 找到分隔符 '$' 的位置
      int delimiterPos = encodeString.indexOf('$', i);

      // 提取字串的長度 (從i到delimiterPos之間的部分)
      int strLength = Integer.parseInt(encodeString.substring(i, delimiterPos));

      // 移動索引到實際字串的位置 (delimiter後的部分)
      i = delimiterPos + 1;

      // 提取對應長度的字串
      String str = encodeString.substring(i, i + strLength);

      // 將 $$ 替換為 $
      result.add(str.replace("$$", "$"));

      // 移動索引到當前字串結束後的位置
      i += strLength;


    }

    return result;

  }

}
