package dev.condenation.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;

public class Helper {
    public static String decript(String input, int numDigits) {
        input = StringUtils.lowerCase(input);
        int index = 0;
        int asciiValue = 0;
        String output = "";

        for (int id = 0; id < input.length(); id++) {
            asciiValue = input.charAt(id);
            if (asciiValue > 96 && asciiValue < 123) { //valid ascii range (lowercase letters)
                if (asciiValue - numDigits < 97) { //out valid ascii range
                    asciiValue = 123 - (97 - (asciiValue - numDigits)); //
                } else {
                    asciiValue = asciiValue - numDigits;
                }
            }
            output = output + (char) asciiValue; // ascii to letter
        }
        return StringUtils.lowerCase(output);
    }

    public static void saveToFile(String content, String fileName) throws Exception {
        FileWriter file = null;
        file = new FileWriter(fileName);
        file.write(content);
        file.flush();
        file.close();
    }
}
