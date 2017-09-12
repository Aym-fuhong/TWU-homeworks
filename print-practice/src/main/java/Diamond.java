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
}
