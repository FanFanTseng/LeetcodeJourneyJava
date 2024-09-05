package com.fanfan.leetcodejourney.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/29
 */
@Service
public class TopKFrequentElementsService {

  /*
   *
   * 空間換取時間
   * 雜湊表 (HashMap)： 用來計算每個元素的出現頻率，時間複雜度為 O(N)。
   * 最小堆 (Min-Heap)： 用來追蹤頻率最高的 k 個元素，操作的時間複雜度為 O(N log k)。
   *
   * 時間複雜度為 O(N log k)
   * 空間複雜度為 O(N + k)
   * */
  public int[] topKFrequentElementsServiceByCountAndSort(int[] input, int k) {

    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int i :input){
      frequencyMap.put(i, frequencyMap.getOrDefault(i,0)+1);
    }

    // (a,b) 這段是一個自定義的比較器來決定優先順序 => a.getValue() - b.getValue() 為負數時，a排在b前面。
    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
      minHeap.offer(entry);
      if (minHeap.size() > k){
        minHeap.poll();
      }
    }

    // Step 3: 從堆中提取元素以形成結果
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = minHeap.poll().getKey();  // 取出堆頂元素
    }
    Arrays.sort(result);

    return result;
  }

  /*
   * 桶排序
   *
   * 時間複雜度為 O(N)
   * 空間複雜度為 O(N)
   * */
  public int[] topKFrequentElementsServiceByBucket(int[] input, int k) {

    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int i :input){
      frequencyMap.put(i, frequencyMap.getOrDefault(frequencyMap.get(i),0)+1);
    }

    // 建立桶，索引表示頻率，數字出現最多的頻率為 " input.length "
    List<Integer>[] buckets = new List[input.length + 1];

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){

      int freq = entry.getValue();
      if(buckets[freq] == null){
        buckets[freq] = new ArrayList<>();
      }
      buckets[freq].add(entry.getKey());
    }


    // 步驟 3：從高頻到低頻遍歷桶，收集前 k 個元素
    List<Integer> topK = new ArrayList<>();
    for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
      if (buckets[i] != null) {
        topK.addAll(buckets[i]);
      }
    }

    // 將結果轉換為數組
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = topK.get(i);
    }

    Arrays.sort(result);

    return result;
  }




}
