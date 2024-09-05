public class Auto {
    private String modelo;
    private String marca;
    private Integer año;


    public Auto(String marca, String modelo, Integer año){
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;

    }

    public Auto(String marca, String modelo){
        this.modelo = modelo;
        this.marca = marca;


    }

    public Auto(String marca){
        this.marca = marca;


    }

    public Auto(){


    }
    public void constructorAuto() {
        if (marca != null) {
            System.out.println("Marca: " + marca);
        }
        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        }
        if (año != null) {
            System.out.println("Año: " + año);
        }
        if (marca == null && modelo == null && año == null) {
            System.out.println("El auto no tiene datos asignados.");
        }
        System.out.println();
    }

}

