package com.regex.exctractionproblems.capitalizedwords;
import java.util.*;
import java.util.regex.*;
public class Sentence {
    public static List<String> capital(String s){
        List<String>sentence=new ArrayList<>();
        String pattern="\\b[A-Z][a-z]*\\b";
        Pattern regex=Pattern.compile(pattern);
        Matcher matcher=regex.matcher(s);
        while(matcher.find()){
            sentence.add(matcher.group());
        }

        return sentence;
    }

    public static void main(String[] args) {
        String s="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String>capitalw=capital(s);
        System.out.println(String.join(",",capitalw));

    }

}
