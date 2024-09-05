package com.fanfan.leetcodejourney.arraysandhashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fanfan.leetcodejourney.arraysandhashing.GroupAnagramsService;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/8/26
 */
@SpringBootTest
public class GroupAnagramsServiceTest {

  @Autowired
  GroupAnagramsService groupAnagramsService;

  @Test
  public void testGroupAnagrams() {
    String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
    Set<Set<String>> expected = Set.of(
        Set.of("bat"),
        Set.of("nat", "tan"),
        Set.of("ate", "eat", "tea")
    );

    assertEquals(expected, groupAnagramsService.groupAnagramsByCharCount(input));
  }

  @Test
  public void testGroupAnagramsIsEmpty() {
    String[] input = new String[]{""};
    Set<Set<String>> expected = Set.of(
        Set.of("")
    );

    assertEquals(expected, groupAnagramsService.groupAnagramsByCharCount(input));
  }

  @Test
  public void testGroupAnagramsLetterA() {
    String[] input = new String[]{"a"};
    Set<Set<String>> expected = Set.of(
        Set.of("a")
    );

    assertEquals(expected, groupAnagramsService.groupAnagramsByCharCount(input));
  }









}
