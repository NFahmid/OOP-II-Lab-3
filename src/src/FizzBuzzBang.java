package src;

public class FizzBuzzBang {

    public FizzBuzzBang() {

    }

    public String mainWork(int number){
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzBang";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 && number % 7 == 0) {
            return "FizzBang";
        } else if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzBang";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 7 == 0) {
            return "Bang";
        } else {
            return "Boom";
        }
    }
}
