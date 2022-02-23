public class Torpede implements  Runnable{
    SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes;

    public Torpede(SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes) {
        this.sistemaDeGuiaDeTorpedes = sistemaDeGuiaDeTorpedes;
    }

    @Override
    public void run() {
        int slotAssignat =sistemaDeGuiaDeTorpedes.adquirirSistemaDeGuia(Thread.currentThread().getName());
        if(slotAssignat!=-1){
            try {
                System.out.println("Llencant torpede");
                Thread.sleep(5000);
                System.out.println("Impacte");
                sistemaDeGuiaDeTorpedes.alliberarSistemaDeGuia(slotAssignat,Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
