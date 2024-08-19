package com.fanfan.leetcodejourney;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/19
 */
@SpringBootTest
public class ContainsDuplicateServiceTest {

  @Autowired
  private ContainsDuplicateService service;

  @Test
  public void testContainsDuplicateWithSet() {
    int[] nums = {2, 7, 11, 2};
    assertEquals(Boolean.TRUE, service.ContainsDuplicateWithSet(nums));
  }


  @Test
  public void testContainsDuplicateWithSetExpectFalse() {
    int[] nums = {2, 7, 11, 5};
    assertEquals(Boolean.FALSE, service.ContainsDuplicateWithSet(nums));
  }

  @Test
  public void testContainsDuplicateWithSort() {
    int[] nums = {2, 7, 11, 2};
    assertEquals(Boolean.TRUE, service.ContainsDuplicateWithSort(nums));
  }


  @Test
  public void testContainsDuplicateWithSortExpectFalse() {
    int[] nums = {2, 7, 11, 5};
    assertEquals(Boolean.FALSE, service.ContainsDuplicateWithSort(nums));
  }

}
