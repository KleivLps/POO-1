public class AutoConstructor {

    public static void main(String[] args) {
       Auto auto1 = new Auto("toyota", "Corolla" , 2024);
       Auto auto2 = new Auto("Nissan", "Primera" );
       Auto auto3 = new Auto("Hyundai");
       Auto auto4 = new Auto();

       auto1.constructorAuto();
       auto2.constructorAuto();
       auto3.constructorAuto();
       auto4.constructorAuto();

    }
}
