package com.regex.replaceandmodify.censorBadWordsinSentence;


import java.util.ArrayList;
import java.util.List;

public class Words {
    public static String censorBadWords(String text, List<String> badWords){

        for(String word : badWords){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<word.length();i++){
                sb.append("*");
            }
            text = text.replaceAll("(?i)\\b"+word+"\\b", sb.toString());
        }
        return text;
    }
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String > badWords = new ArrayList<>();
        badWords.add("damn");
        badWords.add("stupid");
        System.out.println(censorBadWords(text,badWords));

    }
}

