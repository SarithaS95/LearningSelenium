package org.example;

import java.util.ArrayList;
import java.util.List;

public class reverse_collections {
        public static void main(String[] args) {
            String s = "Saritha is a mother of boy";
            String[] arr = s.split(" ");

            // Create an ArrayList to hold the words in reverse order
            List<String> reversedList = new ArrayList<>();
            //List<Character> reversedList = new ArrayList<>();
            for (int i = arr.length - 1; i >= 0; i--) {
                reversedList.add(arr[i]);
                //reversedList.add(s.charAt(i));
            }

            // Print the reversed words one by one
            for (String word : reversedList) {
                System.out.print(word + " ");
            }
        }
    }

