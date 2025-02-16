package com.regex.exctractionproblems.linksfromaWebPage;


import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links {
    public static ArrayList<String> getUrl(String text){
        ArrayList<String> urls  = new ArrayList<>();
        String regex = "\\bhttps?://(www\\.)?[a-zA-Z0-9]+\\.[a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            urls.add(matcher.group());
        }
        return urls;
    }
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        ArrayList<String> urls = getUrl(text);
        System.out.println("List of urls: "+urls);
    }
}

