package entities;

public class Carro {
    private String marca;
    private String cor;
    private int ano;
    private double velocidade;

    public Carro(String marca, String cor, int ano, double velocidade){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Carro(){}

    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        this.velocidade -= 10;
    }

    public void pintar(String valor){
        setCor(valor);
    }

    public String getCor() {
        return cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
