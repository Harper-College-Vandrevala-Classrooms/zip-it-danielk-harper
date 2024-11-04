package com.csc;

import java.util.*;
import java.lang.*;

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
  
  public static <T> HashMap<String, T> hashmapify(List<String> strings, List<T> elements) {
    if (strings.size() != elements.size()) throw new ArrayIndexOutOfBoundsException("strings and elements lists must be the same size.");
    
    HashMap<String, T> hashmap = new HashMap<String, T>();
    
    for(int i = 0; i < strings.size(); i++) {
      hashmap.put(strings.get(i), elements.get(i));
    }
    
    return hashmap;
  }
  
  public static void main(String[] args) {
    List<String> colors = List.of("White", "Black", "Orange", "Pink");
    List<Integer> nums = List.of(1, 3, 5, 7);

    // This should create {"White" => 1, "Black" => 3, "Orange" => 5, "Pink" => 7}
    HashMap<String, Integer> map = hashmapify(colors, nums);
    System.out.println(map.get("White"));
  }
}
