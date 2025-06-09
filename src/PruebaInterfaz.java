import java.util.Scanner;

public class PruebaInterfaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IFigura figura = null;

        System.out.println("Seleccione una figura:");
        System.out.println("1. Punto");
        System.out.println("2. Círculo");
        System.out.println("3. Cilindro");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese coordenada X: ");
                int x1 = scanner.nextInt();
                System.out.print("Ingrese coordenada Y: ");
                int y1 = scanner.nextInt();
                figura = new Punto(x1, y1);
                break;

            case 2:
                System.out.print("Ingrese coordenada X: ");
                int x2 = scanner.nextInt();
                System.out.print("Ingrese coordenada Y: ");
                int y2 = scanner.nextInt();
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(x2, y2, radio);
                break;

            case 3:
                System.out.print("Ingrese coordenada X: ");
                int x3 = scanner.nextInt();
                System.out.print("Ingrese coordenada Y: ");
                int y3 = scanner.nextInt();
                System.out.print("Ingrese el radio: ");
                double r = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                doub
