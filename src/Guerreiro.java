public class Guerreiro extends Personagem{

    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void atacar() {
        IO.println("O guerreiro atacou com a espada");
    }

    @Override
    public String toString() {
        return super.toString() + ", Força: " + forca;
    }
}
