import javafx.scene.shape.Circle;

public class PoolPocket extends Circle {

    private String color;
    public PoolPocket(int x, int y, double radius) {
        super(x, y, radius);
    }

    public void setColor(String color) {
        this.color = color;

    }


}
