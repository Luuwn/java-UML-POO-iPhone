package Equipamento.Internet;

public class Chrome implements NavegarInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Chrome: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Chrome.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Chrome.");
    }

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.exibirPagina("https://www.example.com");
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
    }
}
