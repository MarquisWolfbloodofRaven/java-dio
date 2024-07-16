package iphone_package

public class iphone implements aparelhoTelefonico, reprodutorMusical, navegador {
    private String numeroTelefone;

    public iphone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando iphone");
    }

    public void desligar() {
        System.out.println("Desligando iphone");
    }

    public void fazerChamada(String numeroDestino) {
        System.out.println("Fazendo chamada para " + numeroDestino);
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    public void encerrarChamada() {
        System.out.println("Encerrando chamada");
    }

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocarMusica(String musica, String artista) {
        System.out.println("Tocando música " + musica + " de " + artista);
    }

    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume");
    }

    // Implementação dos métodos da interface Navegador
    public void pesquisar(String pesquisa) {
        System.out.println("Pesquisando por " + pesquisa);
    }

    public void abrirUrl(String url) {
        System.out.println("Abrindo URL " + url);
    }

    public void togglePrivateMode() {
        System.out.println("Toggle private mode");
    }


   
}

