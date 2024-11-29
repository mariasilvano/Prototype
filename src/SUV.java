public class SUV  extends Carro{
    public SUV(){
    super("SUV Padrão", "2.0 Turbo", "Preto", 5);
    }
    @Override
    public void exibir() {
        System.out.println("SUV | Modelo: " + this.getModelo() + " | Motor: " + this.getMotor() +
                " | Cor: " + this.getCor() + " | Portas: " + this.getPortas());
    }
}
