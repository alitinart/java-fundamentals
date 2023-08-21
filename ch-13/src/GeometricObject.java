import java.util.Date;

public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Constructors
    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }
}
