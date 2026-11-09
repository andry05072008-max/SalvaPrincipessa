public class Drago {
    private String nome;
    private Cavaliere cacciatore;

    public Drago(String nome) {
        this.nome = nome;
    }

    public Cavaliere getCacciatore() {
        return this.cacciatore;
    }

    public void setCacciatore(Cavaliere cacciatore) {
        this.cacciatore = cacciatore;
    }

    public String getNome() {
        return this.nome;
    }
}
