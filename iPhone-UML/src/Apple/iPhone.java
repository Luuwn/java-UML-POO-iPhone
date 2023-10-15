package Apple;

import Equipamento.Internet.NavegarInternet;
import Equipamento.Musica.ReprodutorMusical;
import Equipamento.Telefone.ServicoTelefonico;

public class iPhone implements ServicoTelefonico, NavegarInternet, ReprodutorMusical {

    @Override
    public void ligar(int numero) {
        System.out.println("Chamada iniciada para o número: " + numero + " a partir do iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida no iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Serviço de correio de voz iniciado no iPhone.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Safari: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Safari.");
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.ligar(123456789); // Número de exemplo
        myiPhone.atender();
        myiPhone.iniciarCorreioVoz();

        myiPhone.exibirPagina("https://www.example.com");
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();

        myiPhone.tocarMusica("Exemplo de Música");
        myiPhone.pausarMusica();
        myiPhone.selecionarMusica("Outra Música");
    }
}
