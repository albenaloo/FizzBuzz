package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        doFizzBuzz();
    }

    private static void doFizzBuzz() {
        int x = 1;
        boolean divBy3 = false;
        boolean divBy5 = false;
        boolean thing = x < 100;

        while (thing) { // Using a while function instead of a for loop

            if (divBy3 && divBy5) {
                System.out.println("Fizz Buzz");
            }

            else if (divBy3) {
                System.out.println("Fizz");
            }

            else if (divBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(x);

            }
            x += 1;
            thing = x < 100;
            divBy5 = x % 5 == 0;
            divBy3 = x % 3 == 0;
        }

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) { // && instead of and
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) { //else if instead of if
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
        }
    }
