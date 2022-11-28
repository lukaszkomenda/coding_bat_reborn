package org.example.StartWord;

public class StartWord {

    public String startWord(String str, String word){
        if (word.length() == 1 && str.length() > 0) return str.substring(0, 1);
        if (word.length() > 1 && word.length() <= str.length()
                && word.substring(1).equals(str.substring(1, word.length()))) {
            return str.charAt(0) + word.substring(1);
        }
        return "";
    }
}
