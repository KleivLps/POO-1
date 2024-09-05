public class generadorPersona {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.nombre ="KLEIVER";
        persona1.edad = 28;
        persona persona2 = new persona();
        persona2.nombre = "JUAN";
        persona2.edad = 20;

        persona1.imprimirDatos();
        persona2.imprimirDatos();


    }
}
