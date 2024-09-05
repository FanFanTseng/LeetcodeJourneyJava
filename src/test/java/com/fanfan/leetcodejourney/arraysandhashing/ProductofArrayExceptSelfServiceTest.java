package com.fanfan.leetcodejourney.arraysandhashing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/9/5
 */
@SpringBootTest
public class ProductofArrayExceptSelfServiceTest {

  @Autowired
  ProductofArrayExceptSelfService productofArrayExceptSelfService;

  @Test
  public void testProductofArrayExceptSelfServiceSuccess() {
    int[] nums = {1,2,3,4};
    int[] expected =  {24,12,8,6};

    assertTrue(Arrays.equals(expected, productofArrayExceptSelfService.productofArrayExceptSelf(nums)));
  }
}
