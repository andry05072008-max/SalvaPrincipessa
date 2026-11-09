public class Cavaliere implements Runnable {
    private String nome;
    private Thread dragoDaUccidere;

    public Cavaliere(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere = dragoDaUccidere;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 && !this.dragoDaUccidere.isInterrupted(); i = i + 1) {
            try {
                Thread.sleep(5);
                System.out.println(this.nome + " sta cercando di colpire il drago (tentativo " + (1 + i) + ")");
                this.dragoDaUccidere.interrupt();
            } catch (InterruptedException e) {
                System.out.println("Attacco interrotto!");
            }
        }
    }
}
