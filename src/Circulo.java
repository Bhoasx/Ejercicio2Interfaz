public class Circulo extends Punto {
    protected double radio;

    public Circulo() {
        super();
        this.radio = 0.0;
    }

    public Circulo(int x, int y, double valorRadio) {
        super(x, y);
        this.radio = valorRadio;
    }

    public void establecerRadio(double valorRadio) {
        this.radio = valorRadio;
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return 2 * radio;
    }

    public double obtenerCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

    @Override
    public String obtenerNombre() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return String.format("Círculo[radio=%.2f, centro=(%d,%d)]", radio, x, y);
    }
}