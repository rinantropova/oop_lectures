package ex03;

/**
 * This is point 2D
 */
public class point2D {
    int x, y; 
/**
 * This is a constructor ...
 * @param valueX coordinate x
 * @param valueY coordinate y
 */
    public point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public point2D(int value) {
        // this.x = value;
        // this.y = value;
        this(value, value);
    }
    public point2D() {
        this(0);
    }
    // public point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public point2D(int value) {
    //     x = value;
    //     y = value;
    // }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
