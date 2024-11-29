public class Main {
    public static void main(String[] args) {

       SUV suv = new SUV();
       Sedan sedan = new Sedan();
       Esportivo espotivo = new Esportivo();

       Carro suvClone = suv.clone();
       suvClone.setCor("Prata");
       Carro sedanClone = sedan.clone();
       sedanClone.setModelo("ConfortLine");
       Carro esportivoClone = espotivo.clone();
       espotivo.setMotor("4,0 l v8");

       suvClone.exibir();
       sedanClone.exibir();
        esportivoClone.exibir();
    }
}