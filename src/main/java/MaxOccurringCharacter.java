import java.io.*;

public class MaxOccurringCharacter {

    public static char maximumOccurringCharacter(String text) {
        char result = ' ';
        int maxChar = 0;
        int counter[] = new int[256];
        for (int i = 0; i < text.length(); i++) {
            counter[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (maxChar < counter[text.charAt(i)]) {
                maxChar = counter[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String text = "bufferedReader.readLine();";

        char result = MaxOccurringCharacter.maximumOccurringCharacter(text);
        System.out.println(result);
    }
}





