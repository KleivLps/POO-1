public class generadorAuto {

        private String marca;
        private String modelo;
        private int año;


        public generadorAuto(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }


        public generadorAuto(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }


        public generadorAuto(String marca) {
            this.marca = marca;
        }


        public generadorAuto() {
        }


        public void creadorAuto() {
            if (marca != null) {
                System.out.println("Marca: " + marca);
            }
            if (modelo != null) {
                System.out.println("Modelo: " + modelo);
            }
            if (año != 0) {
                System.out.println("Año: " + año);
            }
            if (marca == null && modelo == null && año == 0) {
                System.out.println("El auto no tiene datos asignados.");
            }
            System.out.println();
        }
    }





