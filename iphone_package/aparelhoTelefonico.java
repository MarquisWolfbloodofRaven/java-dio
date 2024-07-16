package iphone_package

public class aparelhoTelefonico {
    private String numeroTelefone;
    private boolean isLigado;
    private boolean isChamadaAtiva;

    public aparelhoTelefonico(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.isLigado = false;
        this.isChamadaAtiva = false;
    }

    public void ligar() {
        if (!this.isLigado) {
            this.isLigado = true;
            System.out.println("Aparelho telefônico ligado");
        } else {
            System.out.println("Aparelho telefônico já está ligado");
        }
    }

    public void desligar() {
        if (this.isLigado) {
            this.isLigado = false;
            System.out.println("Aparelho telefônico desligado");
        } else {
            System.out.println("Aparelho telefônico já está desligado");
        }
    }

    public void fazerChamada(String numeroDestino) {
        if (this.isLigado && !this.isChamadaAtiva) {
            this.isChamadaAtiva = true;
            System.out.println("Chamada em andamento para " + numeroDestino);
        } else {
            System.out.println("Não é possível fazer chamada. Aparelho telefônico desligado ou chamada já ativa");
        }
    }

    public void atenderChamada() {
        if (this.isLigado && !this.isChamadaAtiva) {
            this.isChamadaAtiva = true;
            System.out.println("Chamada atendida");
        } else {
            System.out.println("Não há chamada para atender");
        }
    }

    public void encerrarChamada() {
        if (this.isChamadaAtiva) {
            this.isChamadaAtiva = false;
            System.out.println("Chamada encerrada");
        } else {
            System.out.println("Não há chamada para encerrar");
        }
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public boolean isLigado() {
        return this.isLigado;
    }

    public boolean isChamadaAtiva() {
        return this.isChamadaAtiva;
    }
}