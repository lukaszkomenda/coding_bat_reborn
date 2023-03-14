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
    int[] copyEndy(int[] nums, int count);
    int matchUp(String[] a, String[] b);
    int scoreUp(String[] key, String[] answers);
    String[] wordsWithout(String[] words, String target);
    int scoresSpecial(int[] a, int[] b);
    int sumHeights(int[] heights, int start, int end);
    int sumHeights2(int[] heights, int start, int end);
    int bigHeights(int[] heights, int start, int end);
    int userCompare(String aName, int aId, String bName, int bId);
    String[] mergeTwo(String[] a, String[] b, int n);
    int commonTwo(String[] a, String[] b);
}
