public class Main {
    public static void main(String[] args) {

       SUV suv = new SUV();
       Sedan sedan = new Sedan();

       Carro suvClone = suv.clone();
       suvClone.setCor("Prata");
       Carro sedanClone = sedan.clone();
       sedanClone.setModelo("ConfortLine");

       suvClone.exibir();
       sedanClone.exibir();
    }
}