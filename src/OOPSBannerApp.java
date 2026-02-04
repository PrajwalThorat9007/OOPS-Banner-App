/*
O0PSBannerApp UC6 - 00PS Banner Application (Use Case 6)

This use case extends UC5 by implementing a modular approach to generate each
letter's pattern through dedicated methods. This enhances code reusability and
maintainability by separating pattern generation logic from the main display logic.

@author Developer
@version 6.0
*/

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = buildOOPSBanner();

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    private static String[] buildOOPSBanner() {
        return new String[]{
                String.join("", "  *****   ", "  *****   ", "  *****   ", "  *****  "),
                String.join("", " *     *  ", " *     *  ", " *     *  ", " *      "),
                String.join("", " *     *  ", " *     *  ", " *     *  ", " *      "),
                String.join("", " *     *  ", " *     *  ", " *****   ", "  *****  "),
                String.join("", " *     *  ", " *     *  ", " *       ", "       *"),
                String.join("", " *     *  ", " *     *  ", " *       ", "       *"),
                String.join("", "  *****   ", "  *****   ", " *       ", "  *****  ")
        };
    }
}

