package Equipamento.Musica;

public class iPod implements ReprodutorMusical {

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
        iPod iPod = new iPod();
        iPod.tocarMusica("Exemplo de Música");
        iPod.pausarMusica();
        iPod.selecionarMusica("Outra Música");
    }
}
