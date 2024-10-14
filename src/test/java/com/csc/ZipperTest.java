package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }
  
  @Test
  void noElements() {
    List<Integer> a = List.of();
    List<Integer> b = List.of();
    
    List<Integer> c = zipper.zip(a, b);
    
    assertEquals(c.size(), 0);
  }
  
  @Test
  void firstHasMore() {
    List<Integer> a = List.of(1, 2, 4);
    List<Integer> b = List.of();
    
    List<Integer> c = zipper.zip(a, b);
    
    assertEquals(c.size(), 3);
    assertEquals(c.get(0), 1);
    assertEquals(c.get(1), 2);
    assertEquals(c.get(2), 4);
  }
  
  @Test
  void secondHasMore() {
    List<Integer> a = List.of();
    List<Integer> b = List.of(1, 2, 4);
    
    List<Integer> c = zipper.zip(a, b);
    
    assertEquals(c.size(), 3);
    assertEquals(c.get(0), 1);
    assertEquals(c.get(1), 2);
    assertEquals(c.get(2), 4);
  }
  
  @Test
  void testInterleaving() {
    List<Integer> a = List.of(3, 7, 9);
    List<Integer> b = List.of(1, 2, 4);
    
    List<Integer> c = zipper.zip(a, b);
    
    assertEquals(c.size(), 6);
    assertEquals(c.get(0), 3);
    assertEquals(c.get(1), 1);
    assertEquals(c.get(2), 7);
    assertEquals(c.get(3), 2);
    assertEquals(c.get(4), 9);
    assertEquals(c.get(5), 4);
  }
}
