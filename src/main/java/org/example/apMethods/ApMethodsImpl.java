package org.example.apMethods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApMethodsImpl implements ApMethods{
    @Override
    public boolean scoresIncreasing(int[] scores) {
        boolean isHigh = false;

        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i+1]){
                isHigh = true;
            } else {
                return false;
            }
        }
        return isHigh;
    }

    @Override
    public boolean scores100(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i+1] == 100){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean scoresClump(int[] scores) {

        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i+1] <= 2 && scores[i+ 1] - scores[i] <= 2
                    && scores[i+2] - scores[i] <= 2){
                return true;
            }
        }
        return false;
    }

    @Override
    public int scoresAverage(int[] scores) {
        int half = scores.length /2;
        int sum = 0;
        int averageFirst;
        int averageSecond;

        if (scores.length == 2){
            return Math.max(scores[0], scores[1]);
        }

        for (int i = 0; i <= half; i++) {
            sum += scores[i];
        }
        averageFirst = sum / half;
        sum = 0;

        for (int i = half; i < scores.length; i++) {
            sum += scores[i];
        }
        averageSecond = sum / half;

        return Math.max(averageFirst, averageSecond);
    }

    @Override
    public int wordsCount(String[] words, int len) {
        int counter = 0;

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength == len) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public String[] wordsFront(String[] words, int n) {

        return Arrays.copyOf(words, n);
    }

    @Override
    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> wordsList = new ArrayList<>();

        for (String word : words) {
            if (word.length() != len) {
                wordsList.add(word);
            }
        }

        return wordsList;
    }

    @Override
    public boolean hasOne(int n) {

        while (n > 0){

            if (n % 10 == 1 || n / 10 == 1){
                return true;
            }
            n = n / 10;
        }

        return false;
    }

    @Override
    public boolean dividesSelf(int n) {
        for(int val = n; val != 0; val /= 10) {
            int digit = val % 10;
            if(digit == 0 || n % digit != 0)
                return false;
        }

        return true;
    }

    @Override
    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }

    @Override
    public int[] copyEndy(int[] nums, int count) {
        int[] array = new int[count];
        int index = 0;

        for (int i = 0; index < array.length; i++) {
            if (nums[i] >= 0 && nums[i] <= 10){
                array[index] = nums[i];
                index++;
            } else if (nums[i] >= 90 && nums[i] <= 100) {
                array[index] = nums[i];
                index++;
            }
        }
        
        return array;
    }

    @Override
    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i].length() > 0 && b[i].length() > 0 &&
                    a[i].charAt(0) == b[i].charAt(0))
                count++;
        }

        return count;
    }

    @Override
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            boolean isEqual = answers[i].equals(key[i]);

            if (answers[i].isEmpty() || answers[i].equals("?")){
                score += 0;
            } else if (isEqual) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        return score;
    }
}
