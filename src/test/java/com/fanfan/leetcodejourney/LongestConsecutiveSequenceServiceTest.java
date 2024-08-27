package com.fanfan.leetcodejourney;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/28
 */
@SpringBootTest
public class LongestConsecutiveSequenceServiceTest {

  @Autowired
  LongestConsecutiveSequenceService longestConsecutiveSequenceService;

  @Test
  public void testLongestConsecutiveSequenceA() {
    int[] nums = {100,4,200,1,3,2};
    int expectedCounts = 4;

    assertEquals(expectedCounts, longestConsecutiveSequenceService.longestConsecutiveSequenceBySet(nums));
  }

  @Test
  public void testLongestConsecutiveSequenceB() {
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    int expectedCounts = 9;

    assertEquals(expectedCounts, longestConsecutiveSequenceService.longestConsecutiveSequenceBySet(nums));
  }


}
