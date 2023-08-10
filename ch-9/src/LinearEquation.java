public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public int getX() {
        return (e*d - b*f) / (a*d - b*c);
    }

    public int getY() {
        return (a*f - e*c) / (a*d - b*c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
}

class LinearEquationTest {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(1,2,3,4,5,6);
        if(!linearEquation.isSolvable()) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("The equation is solvable");
        }
    }
}