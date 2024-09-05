package com.fanfan.leetcodejourney.arraysandhashing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fanfan.leetcodejourney.arraysandhashing.ValidAnagramService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/21
 */
@SpringBootTest
public class ValidAnagramServiceTest {

  @Autowired
  private ValidAnagramService validAnagramService;

  @Test
  public void testValidAnagram() {
    String s = "anagram";
    String t = "nagaram";

    assertEquals(Boolean.TRUE, validAnagramService.ValidAnagramWithSort(s,t));
    assertEquals(Boolean.TRUE, validAnagramService.ValidAnagramWithCount(s,t));
  }

  @Test
  public void testValidAnagramWithSortFail() {
    String s = "rat";
    String t = "car";

    assertEquals(Boolean.FALSE, validAnagramService.ValidAnagramWithSort(s,t));
    assertEquals(Boolean.FALSE, validAnagramService.ValidAnagramWithCount(s,t));
  }



}
