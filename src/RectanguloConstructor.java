import java.util.ArrayList;
import java.util.Scanner;

public class RectanguloConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangulo> rectangulos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear rectángulo");
            System.out.println("2. Mostrar área del último rectángulo creado");
            System.out.println("3. Mostrar perímetro del último rectángulo creado");
            System.out.println("4. Mostrar total de rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulos.add(rectangulo);
                    System.out.println("Rectángulo creado exitosamente.\n");
                    break;

                case 2:
                    if (!rectangulos.isEmpty()) {
                        Rectangulo ultimoRectangulo = rectangulos.get(rectangulos.size() - 1);
                        ultimoRectangulo.imprimirArea();
                    } else {
                        System.out.println("No se ha creado ningún rectángulo.\n");
                    }
                    break;

                case 3:
                    if (!rectangulos.isEmpty()) {
                        Rectangulo ultimoRectangulo = rectangulos.get(rectangulos.size() - 1);
                        ultimoRectangulo.imprimirPerimetro();
                    } else {
                        System.out.println("No se ha creado ningún rectángulo.\n");
                    }
                    break;

                case 4:
                    System.out.println("Total de rectángulos creados: " + Rectangulo.obtenerContadorRectangulos() + "\n");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
