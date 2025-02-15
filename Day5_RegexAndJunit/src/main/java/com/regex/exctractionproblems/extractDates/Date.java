package com.regex.exctractionproblems.extractDates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class Date {
        public static List<String> extractDates(String text) {
            List<String> dates = new ArrayList<>();
            String pattern = "\\b(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})\\b";

            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(text);

            while (matcher.find()) {
                dates.add(matcher.group());
            }

            return dates;
        }

        public static void main(String[] args) {
            String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
            List<String> extractedDates = extractDates(text);

            System.out.println(String.join(", ", extractedDates));
        }
    }


