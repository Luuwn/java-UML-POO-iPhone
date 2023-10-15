package Equipamento.Telefone;

public class BlackBerry implements ServicoTelefonico {

    @Override
    public void ligar(int numero) {
        System.out.println("Chamada iniciada para o número: " + numero + " a partir do BlackBerry.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida no BlackBerry.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Serviço de correio de voz iniciado no BlackBerry.");
    }

    public static void main(String[] args) {
        BlackBerry blackBerry = new BlackBerry();
        blackBerry.ligar(123456789); // Número de exemplo
        blackBerry.atender();
        blackBerry.iniciarCorreioVoz();
    }
}
