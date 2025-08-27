package Bridge_Labz;
import java.util.*;

public class CustomTrim {
    public static int[] findStartEnd(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end}; 
    }
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();
        int[] pos = findStartEnd(input);

        String trimmedCustom = "";
        if (pos[0] <= pos[1]) { 
            trimmedCustom = customSubstring(input, pos[0], pos[1]);
        }
        String trimmedBuiltIn = input.trim();
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("\nOriginal String: \"" + input + "\"");
        System.out.println("Custom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both results same? " + isEqual);
        sc.close();
    }
}

