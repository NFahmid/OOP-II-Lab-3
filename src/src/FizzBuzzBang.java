package src;

public class FizzBuzzBang {

    public FizzBuzzBang() {

    }

    private boolean uppercase = false;

    public void toggleUppercase() {
        if (uppercase) {
            uppercase = false;
        } else {
            uppercase = true;
        }
    }

    public String mainWork(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        if (number % 7 == 0) {
            result.append("Bang");
        }

        if (result.isEmpty()) {
            result.append("Boom");
        } else if (uppercase) {
            result = new StringBuilder(result.toString().toUpperCase());
        }

        return result.toString();
    }
}
