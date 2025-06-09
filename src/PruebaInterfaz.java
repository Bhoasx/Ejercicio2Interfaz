public class PruebaInterfaz {
    public static void main(String[] args) {
        IFigura[] figuras = new IFigura[3];

        figuras[0] = new Punto(1, 2);
        figuras[1] = new Circulo(3, 4, 5);
        figuras[2] = new Cilindro(5, 6, 2, 10);

        for (IFigura figura : figuras) {
            System.out.println("Nombre: " + figura.obtenerNombre());
            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Volumen: " + figura.obtenerVolumen());
            System.out.println("Descripción: " + figura.toString());
            System.out.println("----------------------------------------");
        }
    }
}