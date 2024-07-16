package iphone_package
public class navegador {
    private String name;
    private String url;
    private boolean isPrivateMode;

    public navegador(String name) {
        this.name = name;
        this.url = "";
        this.isPrivateMode = false;
    }

    public void pesquisar(String pesquisa) {
        // implementação da pesquisa
        System.out.println("Pesquisando por: " + pesquisa);
    }

    public void abrirUrl(String url) {
        this.url = url;
        System.out.println("Abrindo URL: " + url);
    }

    public void togglePrivateMode() {
        this.isPrivateMode = !this.isPrivateMode;
        System.out.println("Modo privado: " + (this.isPrivateMode ? "ativado" : "desativado"));
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPrivateMode() {
        return this.isPrivateMode;
    }
}