import javafx.scene.paint.Color;

/**
 * A simple class to represent food that takes up only one square.
 *
 * @author Subhomoy Haldar
 * @version 2016.12.17
 */
public class Food {
    public static final Color COLOR = Color.ROSYBROWN;

    private Point point;

    Food(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
