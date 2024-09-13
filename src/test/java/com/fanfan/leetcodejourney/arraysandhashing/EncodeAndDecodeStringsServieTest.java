package com.fanfan.leetcodejourney.arraysandhashing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Project: LeetCodeJourney Created by: arten Date: 2024/9/12
 */
@SpringBootTest
public class EncodeAndDecodeStringsServieTest {

  @Autowired
  EncodeAndDecodeStringsServie encodeAndDecodeStringsServie;

  @Test
  public void testEncodeAndDecodeStringsServieSuccess() {

    List<String> str = List.of("hello#", "foo#bar", "123#456");
    String encodeString = encodeAndDecodeStringsServie.encode(str);
    List<String> decodeStrings = encodeAndDecodeStringsServie.decode(encodeString);

    assertTrue(str.equals(decodeStrings));
  }


}
