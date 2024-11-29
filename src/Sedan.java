public class Sedan extends Carro {
    public Sedan() {
        super("Sedan Padrão", "1.6", "Prata", 4);
    }

    @Override
    public void exibir() {
        System.out.println("Sedan | Modelo: " + this.getModelo() + " | Motor: " + this.getMotor() +
                " | Cor: " + this.getCor() + " | Portas: " + this.getPortas());
    }
}