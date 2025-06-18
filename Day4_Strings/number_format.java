package Day4_Strings;

import java.util.*;

public class number_format {
    static void generateException() {
        String text = "abc";
        int num = Integer.parseInt(text);
    }

    static void handleException() {
        try {
            String text = "abc";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
