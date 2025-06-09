public class Punto implements IFigura {
    protected int x;
    protected int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int valorX, int valorY) {
        this.x = valorX;
        this.y = valorY;
    }

    public void establecerX(int valorX) {
        this.x = valorX;
    }

    public void establecerY(int valorY) {
        this.y = valorY;
    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }

    @Override
    public double obtenerArea() {
        return 0.0;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

    @Override
    public String obtenerNombre() {
        return "Punto";
    }

    @Override
    public String toString() {
        return String.format("Punto[x=%d, y=%d]", x, y);
    }
}