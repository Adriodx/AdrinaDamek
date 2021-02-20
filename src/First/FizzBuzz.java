package First;

public class FizzBuzz {
    private void runFizzBuzz() {


        System.out.println("Printing 1-100");
        for (int i = 1; i < 101; i++) {
            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : i);
        }
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0))
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }
    }
    public void run() {
        runFizzBuzz();
    }

}
