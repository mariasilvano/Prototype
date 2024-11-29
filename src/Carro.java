public abstract class Carro implements Cloneable {
    private String modelo;
    private String motor;
    private String cor;
    private int portas;


    public Carro(String modelo, String motor, String cor, int portas) {
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.portas = portas;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public abstract void exibir();
}
