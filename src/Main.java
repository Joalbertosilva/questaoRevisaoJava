import entities.CarroEsportivo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarroEsportivo novoCarro = new CarroEsportivo();
        novoCarro.setMarca("Ferrari");
        novoCarro.setCor("Vermelho");
        novoCarro.setAno(2024);
        novoCarro.setVelocidade(100.00);
        novoCarro.ativarModoEsportivo();
        novoCarro.frear();
        System.out.println(novoCarro);
    }
}