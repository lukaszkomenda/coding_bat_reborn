package org.example.apMethods;

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
}
