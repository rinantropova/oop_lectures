package lect1.ex03;

public class point2D {
    int x, y;

    public point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    public point2D() {
        x = 0;
        y = 0;
    }

    public point2D(int value) {
        x = value;
        y = value;
    }

    private     String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
