package entities;

public class CarroEsportivo extends Carro {
    private double modoEsportivo;

    public CarroEsportivo(double modoEsportivo, String marca, String cor, int ano, double velocidade){
        super(marca, cor, ano, velocidade);
        this.modoEsportivo = modoEsportivo;
    }
    public CarroEsportivo(){}

    public void ativarModoEsportivo(){
        modoEsportivo = 100;
    }

    public double getModoEsportivo() {
        return modoEsportivo;
    }

    public void setModoEsportivo(double modoEsportivo) {
        this.modoEsportivo = modoEsportivo;
    }

    @Override
    public String toString() {
        return "CarroEsportivo: " +
                "\nMarca: " + getMarca() +
                "\nCor: " + getCor() +
                "\nAno: " + getAno() +
                "\nVelocidade: " + getVelocidade() +
                "\nModo esportivo: " + getModoEsportivo();
    }

    @Override
    public void frear() {
        double novaVelocidade = this.getVelocidade() - 10;

        if (novaVelocidade < 0) {
            novaVelocidade = 0;
        }

        if (modoEsportivo > 0) {
            this.setVelocidade(novaVelocidade - this.modoEsportivo);
        }
    }

    @Override
    public double getVelocidade(){
        return super.getVelocidade() + this.modoEsportivo;
    }
}
