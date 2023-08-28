import java.util.Scanner;

/**
 *
 * *13.17 (Math: The Complex class)
 *
 */
public class Complex {
    private double a;
    private double b;

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String add(Complex complexNum) {
        return (a + complexNum.getA()) + " + " + (b + complexNum.getB()) + "i";
    }

    public String subtract(Complex complexNum) {
        return (a - complexNum.getA()) + " + " + (b - complexNum.getB()) + "i";
    }

    public String multiply(Complex complexNum) {
        return ((a * complexNum.getA()) - (b * complexNum.getB())) + " + " + ((b * complexNum.getA()) - (a * complexNum.getB())) + "i";
    }

    public String divide(Complex complexNum) {
        return (((a * complexNum.getA()) + (b * complexNum.getB())) / (Math.pow(complexNum.getA(), 2) + Math.pow(complexNum.getB(), 2))) + " + " + (((b * complexNum.getA()) - (a * complexNum.getB()))/(Math.pow(complexNum.getA(), 2) + Math.pow(complexNum.getB(), 2))) + "i";
    }

    public double abs() {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Enter the second complex number: ");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        Complex firstComplex = new Complex(a, b);
        Complex secondComplex = new Complex(c, d);

        System.out.println(firstComplex.add(secondComplex));
        System.out.println(firstComplex.subtract(secondComplex));
        System.out.println(firstComplex.multiply(secondComplex));
        System.out.println(firstComplex.divide(secondComplex));
        System.out.println(firstComplex.abs());
        System.out.println(secondComplex.abs());
    }
}