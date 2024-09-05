public class Rectangulo {

        private double ancho;
        private double alto;
        private static int contadorRectangulos = 0;

        // Constructor que inicializa ancho y alto, y aumenta el contador de rectángulos
        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
            contadorRectangulos++;
        }

        // Método para calcular el área del rectángulo
        public double area() {
            return ancho * alto;
        }

        // Método para calcular el perímetro del rectángulo
        public double perimetro() {
            return 2 * (ancho + alto);
        }

        // Método para imprimir el área
        public void imprimirArea() {
            System.out.println("Área del rectángulo: " + area());
        }

        // Método para imprimir el perímetro
        public void imprimirPerimetro() {
            System.out.println("Perímetro del rectángulo: " + perimetro());
        }

        // Método estático para obtener el número total de rectángulos creados
        public static int obtenerContadorRectangulos() {
            return contadorRectangulos;
        }
}
