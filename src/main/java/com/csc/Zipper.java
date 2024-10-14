package com.csc;

import java.util.*;

public class Zipper {
  
  public static <T> List<T> zip(List<T> arr1, List<T> arr2) {
    ArrayList<T> out = new ArrayList<T>();
    
    int index = 0;
    while (index < arr1.size() || index < arr2.size()) {
      if (index < arr1.size()) {
        out.add(arr1.get(index));
      }
      
      if (index < arr2.size()) {
        out.add(arr2.get(index));
      }
      
      index++;
    }
    
    return out;
  }
  
  public static void main(String[] args) {
    List<Integer> nums1 = List.of(1, 3, 5, 7);
    List<Integer> nums2 = List.of(2, 4, 6, 8);
    List<Integer> mergedNumbers = zip(nums1, nums2);
    System.out.println(mergedNumbers); // [1, 2, 3, 4, 5, 6, 7, 8]

    List<String> colors1 = List.of("Red", "Green", "Blue");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> mergedWords = zip(colors1, colors2);
    System.out.println(mergedWords); // [Red, White, Green, Black, Blue, Orange, Pink]
  }
}
