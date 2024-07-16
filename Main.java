import iphone_package.iphone;

public class Main {
    public static void main(String[] args) {
        iphone meuIphone = new iphone("1234567890");

        meuIphone.ligar();
        meuIphone.fazerChamada("9876543210");
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();

        meuIphone.tocarMusica("Happy", "Pharrell Williams");
        meuIphone.pausarMusica();
        meuIphone.aumentarVolume();

        meuIphone.pesquisar("Java");
        meuIphone.abrirUrl("https://www.google.com");
        meuIphone.togglePrivateMode();
    }
}
