package org.example.mapinterface.wordfrequencyCounter;

import java.util.HashMap;

public class Frequency {


    public static void main(String[] args) {

                String s = "Hello world, hello Java!";

                // Convert to lowercase
                s = s.toLowerCase();

                // Remove punctuation manually
                StringBuilder cleanText = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (Character.isLetterOrDigit(c) || c == ' ') {
                        cleanText.append(c);
                    }
                }

                // Split words and count frequency
                HashMap<String, Integer> wordCount = new HashMap<>();
                for (String word : cleanText.toString().split(" ")) {
                    if (!word.isEmpty()) { // Avoid counting empty words
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }

                // Print result
                System.out.println(wordCount);
            }
        }


