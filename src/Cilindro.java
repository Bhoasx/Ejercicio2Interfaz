public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 0.0;
    }

    public Cilindro(int x, int y, double radio, double valorAltura) {
        super(x, y, radio);
        this.altura = valorAltura;
    }

    public void establecerAltura(double valorAltura) {
        this.altura = valorAltura;
    }

    public double obtenerAltura() {
        return altura;
    }

    @Override
    public double obtenerArea() {
        // Área superficial = 2πr^2 + 2πrh
        return 2 * Math.PI * radio * radio + 2 * Math.PI * radio * altura;
    }

    @Override
    public double obtenerVolumen() {
        // Volumen = πr^2h
        return Math.PI * radio * radio * altura;
    }

    @Override
    public String obtenerNombre() {
        return "Cilindro";
    }

    @Override
    public String toString() {
        return String.format("Cilindro[radio=%.2f, altura=%.2f, centro=(%d,%d)]", radio, altura, x, y);
    }
}