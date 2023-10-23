public class FizzBuzz {
    public static void main(String[] args) {
        int fizzCounter = 3; //keep track of # of times print ("Fizz") is executed
        int buzzCounter = 5;
        for (int i = 1; i <= 100; i++) {
            fizzCounter--; //increments down to 0
            buzzCounter--;
            if (fizzCounter == 0 && buzzCounter == 0) {
                System.out.println("FizzBuzz");
                fizzCounter = 3; //reset counter to 3
                buzzCounter = 5; //reset counter to 5
            } else if (fizzCounter == 0) {
                System.out.println("Fizz");
                fizzCounter = 3;
            } else if (buzzCounter == 0) {
                System.out.println("Buzz");
                buzzCounter = 5;
            } else {
                System.out.println(i);
            }
        }
    }
}
