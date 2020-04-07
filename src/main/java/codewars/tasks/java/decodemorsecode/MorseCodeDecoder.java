package codewars.tasks.java.decodemorsecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    /*
    In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice
    and digital data communication channels, it still has its use in some applications around the world.
    The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−,
    letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital
    letters are used. When the message is written in Morse code, a single space is used to separate the character codes and
    3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
     */
    private static Map<String, String> morseMap = new HashMap<>();

    static {
        String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " ", "!", ".",
                "SOS" };
        String[] dots = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|", "-.-.--",
                ".-.-.-", "...---..." };

        for (int i = 0; i < letters.length; i++) {
            morseMap.put(dots[i], letters[i]);
        }
    }

    public static String decode(String morseCode){

            return Arrays.stream(morseCode.trim().split("   "))
                    .map(MorseCodeDecoder::translate)
                    .collect(Collectors.joining(" "));
        }

    public static String translate(String word) {
            return Arrays.stream(word.split(" "))
                    .map(morseMap::get)
                    .collect(Collectors.joining())
                    .toUpperCase();
        }

}
