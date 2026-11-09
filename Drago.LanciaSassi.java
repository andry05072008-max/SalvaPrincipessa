public class D_LanciaSassi extends Drago implements Runnable {
    public D_LanciaSassi(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 && !Thread.interrupted(); i = i + 1) {
            System.out.println(this.getNome() + " lancia sassi e si libra nell'aria! Battito " + (1 + i));
        }
    }
}
