public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void atacar() {
        IO.println("O mago lançou um feitiço!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana: " + mana;
    }
}
