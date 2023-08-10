/**
 *
 * 10.3 MyInteger

 * Design a class named MyInteger. The class contains:
     *  ■ An int data field named value that stores the int value represented by this object.
     *  ■ A constructor that creates a MyInteger object for the specified int value.
     *  ■ A getter method that returns the int value.
     *  ■ The methods isEven(), isOdd(), and isPrime() that return true if the
     * value in this object is even, odd, or prime, respectively.
     *  ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
     * return true if the specified value is even, odd, or prime, respectively.
     *  ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
     * isPrime(MyInteger) that return true if the specified value is even, odd,
     * or prime, respectively.
     *  ■ The methods equals(int) and equals(MyInteger) that return true if
     * the value in this object is equal to the specified value.
     *  ■ A static method parseInt(char[]) that converts an array of numeric
     * characters to an int value.
     *  ■ A static method parseInt(String) that converts a string into an int
     * value.
 *
 */
public class MyInteger {
    private int integer;

    public MyInteger(int integer) {
        this.integer = integer;
    }

    public static boolean isEven(int integer) {
        return (integer % 2) == 0;
    }

    public static boolean isOdd(int integer) {
        return (integer % 2) != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int integer) {
        return integer == this.integer;
    }

    public boolean equals(MyInteger integer) {
        return this.integer == integer.getInteger();
    }

    public static int parseInt(char[] array) {
        int finalNumber = 0;
        int factor = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            finalNumber += (array[i] - '0') * factor;
            factor *= 10;
        }

        return finalNumber;
    }

    public int getInteger() {
        return integer;
    }
}

class TestMyInteger {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(1);
        MyInteger int2 = new MyInteger(1);

        System.out.println("Is 1 prime ? " + MyInteger.isPrime(1));
        System.out.println("Is 2 Even ? " + MyInteger.isEven(2));
        System.out.println("Is 3 Odd ? " + MyInteger.isOdd(3));
        System.out.println("12 in integer: " + MyInteger.parseInt(new char[] {'1','2'}));

    }
}