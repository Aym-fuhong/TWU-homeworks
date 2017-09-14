public class Diamond {

    public String centered_triangle(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            String asteriskLine = "";
            for (int k = 1; k <= number - i; k++) {
                asteriskLine += " ";
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                asteriskLine += "*";
            }
            result += asteriskLine + "\n";
        }
        return result;
    }

    public String inverted_triangle(int number) {
        int space = 1;
        String result = "";
        for (int i = 1; i <= number - 1; i++) {
            String asteriskLine = "";
            for (int k = 1; k <= space; k++) {
                asteriskLine += " ";
            }
            for (int j = 1; j <= 2 * (number - i) - 1; j++) {
                asteriskLine += "*";
            }
            space++;
            result += asteriskLine + "\n";
        }
        return result;
    }

    public String centered_diamond(int number) {
        String result = "";
        String centered_triangle = centered_triangle(number);
        result += centered_triangle;
        String inverted_triangle = inverted_triangle(number);
        result += inverted_triangle;
        return result;
    }

    public String centered_diamond_name(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            String asteriskLine = "";
            for (int k = 1; k <= number - i; k++) {
                asteriskLine += " ";
            }
            if (i == number) {
                asteriskLine += "Aym";
            } else {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    asteriskLine += "*";
                }
            }
            result += asteriskLine + "\n";
        }
        String inverted_triangle = inverted_triangle(number);
        result += inverted_triangle;
        return result;
    }

}
