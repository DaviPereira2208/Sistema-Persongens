void main() {

    Personagem p1 = new Personagem("Camponês", 1, 50);
    Mago merlin = new Mago("Merlin", 5, 80, 100);
    Guerreiro arthur = new Guerreiro("Arthur", 7, 95, 90);

    IO.println("--- Representação Textual dos Personagens ---");
    IO.println(p1);
    IO.println(merlin);
    IO.println(arthur);

    IO.println("\n--- Demonstração dos Ataques (Polimorfismo) ---");
    p1.atacar();
    merlin.atacar();
    arthur.atacar();

    IO.println("\n--- Demonstração das Validações ---");
    // Teste de alteração de vida acima do limite máximo (100)
    merlin.setVida(150);
    // Teste de nível abaixo do limite mínimo (1)
    arthur.setNivel(-3);

    IO.println(merlin);
    IO.println(arthur);
}
