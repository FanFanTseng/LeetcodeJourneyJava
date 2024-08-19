package com.fanfan.leetcodejourney;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TwoSumServiceTest {

  @Autowired
  private TwoSumService twoSumService;

  @Test
  public void testTwoSum() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSumService.twoSum(nums, target);
    assertArrayEquals(new int[]{0, 1}, result);
  }

  @Test
  public void testTwoSumNoSolution() {
    int[] nums = {1, 2, 3, 4};
    int target = 8;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      twoSumService.twoSum(nums, target);
    });
    assertEquals("No two sum solution", exception.getMessage());
  }

  @Test
  public void testTwoSumUseHashMap() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSumService.twoSumUseHashMap(nums, target);
    assertArrayEquals(new int[]{0, 1}, result);
  }

  @Test
  public void testTwoSumNoSolutionUseHashMap() {
    int[] nums = {1, 2, 3, 4};
    int target = 8;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      twoSumService.twoSumUseHashMap(nums, target);
    });
    assertEquals("No two sum solution", exception.getMessage());
  }

}