import java.util.Scanner;

public class generadorAutoConstructor {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    generadorAuto auto = null;
    int opcion;

    do {
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear auto con marca, modelo y año");
        System.out.println("2. Crear auto con marca y modelo");
        System.out.println("3. Crear auto con solo la marca");
        System.out.println("4. Crear auto sin datos");
        System.out.println("5. Mostrar datos del auto");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la marca: ");
                String marca1 = scanner.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modelo1 = scanner.nextLine();
                System.out.print("Ingrese el año: ");
                int año1 = scanner.nextInt();
                auto = new generadorAuto(marca1, modelo1, año1);
                break;

            case 2:
                System.out.print("Ingrese la marca: ");
                String marca2 = scanner.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modelo2 = scanner.nextLine();
                auto = new generadorAuto(marca2, modelo2);
                break;

            case 3:
                System.out.print("Ingrese la marca: ");
                String marca3 = scanner.nextLine();
                auto = new generadorAuto(marca3);
                break;

            case 4:
                auto = new generadorAuto();
                break;

            case 5:
                if (auto != null) {
                    auto.creadorAuto();
                } else {
                    System.out.println("No se ha creado ningún auto.");
                }
                break;

            case 6:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    } while (opcion != 6);

    scanner.close();
}
    }


