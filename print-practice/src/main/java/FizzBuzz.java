public class FizzBuzz {

    public String FizzBuzz(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            String word = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                result += i;
            }
            result += word + "\n";
        }
        return result;
    }
}
