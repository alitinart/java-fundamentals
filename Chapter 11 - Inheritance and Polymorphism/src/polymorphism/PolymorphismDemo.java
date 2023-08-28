package polymorphism;

import geometric.CircleFromSimpleGeometricObject;
import geometric.RectangleFromSimpleGeometricObject;
import geometric.SimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject("red", false, 1));
        displayObject(new RectangleFromSimpleGeometricObject("black", true, 1, 1));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
