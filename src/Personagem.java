public class Personagem {

    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        setNivel(nivel);
        setVida(vida);
    }

    // Encapsulamento com validação controlada
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    // Método que será sobrescrito pelas subclasses (Polimorfismo)
    public void atacar() {
        IO.println("O personagem realizou um ataque!");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nível: " + nivel + ", Vida: " + vida;
    }
}
