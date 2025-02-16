package com.regex.replaceandmodify.replacemultipleSpaceswithaSinglespace;


public class Replace {
    public static String removeExtraSpace(String s){
        String updatedString = s.replaceAll("\\s+"," ");
        return updatedString;
    }
    public static void main(String[] args) {
        String s = "This is an example  with  multiple  spaces.";
        String updatedText = removeExtraSpace(s);
        System.out.println(updatedText);

    }
}

