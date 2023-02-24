package org.example.apMethods;

import java.util.List;

public interface ApMethods {
    boolean scoresIncreasing(int[] scores);
    boolean scores100(int[] scores);
    boolean scoresClump(int[] scores);
    int scoresAverage(int[] scores);
    int wordsCount(String[] words, int len);
    String[] wordsFront(String[] words, int n);
    List<String> wordsWithoutList(String[] words, int len);
    boolean hasOne(int n);
    boolean dividesSelf(int n);
    int[] copyEvens(int[] nums, int count);
}
