package com.fanfan.leetcodejourney;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/29
 */
@SpringBootTest
public class TopKFrequentElementsServiceTest {

  @Autowired
  TopKFrequentElementsService topKFrequentElementsService;

  @Test
  public void testFrequentElementsServiceSuccess() {
    int[] nums = {1,1,1,2,2,3};
    int k = 2;
    int[] expected =  {1,2};

    assertTrue(Arrays.equals(expected, topKFrequentElementsService.topKFrequentElementsServiceByCountAndSort(nums, k )));
    assertTrue(Arrays.equals(expected, topKFrequentElementsService.topKFrequentElementsServiceByBucket(nums, k )));
  }

  @Test
  public void testFrequentElementsServiceSuccess2() {
    int[] nums = {1};
    int k = 1;
    int[] expected =  {1};

    assertTrue(Arrays.equals(expected, topKFrequentElementsService.topKFrequentElementsServiceByCountAndSort(nums, k )));
    assertTrue(Arrays.equals(expected, topKFrequentElementsService.topKFrequentElementsServiceByBucket(nums, k )));
  }


}
