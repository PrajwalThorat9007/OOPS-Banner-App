/*
00PSBannerApp - Use Map for Character Patterns and Render via Function

This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
such as the Collections Framework to manage character patterns in a more flexible
and efficient manner. The application retrieves and displays the "00PS" banner
using a HashMap there by enhancing code organization and modularity.

@author Developer
@version 8.0
*/
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // ⭐ Inner Static Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // 1️⃣ Create Map of character patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', getOPattern()));
        patternMap.put('P', new CharacterPattern('P', getPPattern()));
        patternMap.put('S', new CharacterPattern('S', getSPattern()));

        // 2️⃣ Word can now be dynamic
        String word = "OOPS";

        // 3️⃣ Print banner dynamically
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    // ---------- Pattern Providers ----------

    public static String[] getOPattern() {
        return new String[]{
                "    ***    ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "    ***    "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " *******   ",
                " **     ** ",
                " **     ** ",
                " *******   ",
                " **        ",
                " **        ",
                " **        "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *******  ",
                " **        ",
                "    **     ",
                "      **   ",
                "        ** ",
                "        ** ",
                "  *******  "
        };
    }
}
