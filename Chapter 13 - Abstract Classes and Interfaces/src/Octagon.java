/**
 *
 * *13.11 (The Octagon class)

 * Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces. Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * area = (2 + 4/sqr2) * side * side
 *
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2 + 4/Math.sqrt(2)) * side * side;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Octagon o) {
        if(o.getArea() > this.getArea()) {
            return -1;
        } else if (o.getArea() < this.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class TestOctagon {
    public static void main(String[] args) {
        Octagon oct = new Octagon(5);
        Octagon clonedOct;

        try {
            clonedOct = (Octagon) oct.clone();
        }
        catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return;
        }

        System.out.println("Oct compared to clonedOct: " + oct.compareTo(clonedOct));
        System.out.println("Oct compared to clonedOct using operator " + (oct == clonedOct));

    }
}
