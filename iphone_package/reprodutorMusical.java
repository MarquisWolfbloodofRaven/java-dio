package iphone_package
    public class reprodutorMusical {
        private String nome;
        private String artista;
        private String musica;
        private int volume;
        private boolean isPlaying;
    
        public reprodutorMusical(String nome) {
            this.nome = nome;
            this.artista = "";
            this.musica = "";
            this.volume = 50;
            this.isPlaying = false;
        }
    
        public void tocarMusica(String musica, String artista) {
            this.musica = musica;
            this.artista = artista;
            this.isPlaying = true;
            System.out.println("Tocando música: " + musica + " de " + artista);
        }
    
        public void pausarMusica() {
            this.isPlaying = false;
            System.out.println("Música pausada");
        }
    
        public void aumentarVolume() {
            if (this.volume < 100) {
                this.volume += 10;
                System.out.println("Volume aumentado para " + this.volume + "%");
            } else {
                System.out.println("Volume máximo alcançado");
            }
        }
    
        public void diminuirVolume() {
            if (this.volume > 0) {
                this.volume -= 10;
                System.out.println("Volume diminuído para " + this.volume + "%");
            } else {
                System.out.println("Volume mínimo alcançado");
            }
        }
    
        public String getNome() {
            return this.nome;
        }
    
        public String getArtista() {
            return this.artista;
        }
    
        public String getMusica() {
            return this.musica;
        }
    
        public int getVolume() {
            return this.volume;
        }
    
        public boolean isPlaying() {
            return this.isPlaying;
        }
    }

