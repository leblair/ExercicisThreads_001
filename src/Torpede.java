public class Torpede implements  Runnable{
    SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes;

    public Torpede(SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes) {
        this.sistemaDeGuiaDeTorpedes = sistemaDeGuiaDeTorpedes;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
