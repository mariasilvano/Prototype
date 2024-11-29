class Esportivo extends Carro {
    public Esportivo() {
        super("Esportivo Padrão", "3.5 V6", "Vermelho", 2);
    }

    @Override
    public void exibir() {
        System.out.println("Esportivo | Modelo: " + this.getModelo() + " | Motor: " + this.getMotor() +
                " | Cor: " + this.getCor() + " | Portas: " + this.getPortas());
    }
}