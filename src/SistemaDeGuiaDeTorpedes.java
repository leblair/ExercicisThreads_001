import java.util.concurrent.Semaphore;

public class SistemaDeGuiaDeTorpedes {

    Semaphore semaphore;
    private final int numDeTorpedesQuePotGuiarSimultaneament = 3;
    private boolean[] usDelSistemaDeGuia;

    public SistemaDeGuiaDeTorpedes() {
        this.semaphore = new Semaphore(this.numDeTorpedesQuePotGuiarSimultaneament);
        this.usDelSistemaDeGuia = new boolean[]{false, false, false};
    }

    int adquirirSistemaDeGuia(String nomThread) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return assignarSistemaDeGuia(nomThread); //numero del slot asignado
    }

    synchronized int assignarSistemaDeGuia(String nomThread) {
        for (int i = 0; i < usDelSistemaDeGuia.length; i++) {
            if (!usDelSistemaDeGuia[i]) {
                usDelSistemaDeGuia[i] = true;
                System.out.println("Slot asignat: " + i);
                imprimirUsDelSistemaDeGuia(nomThread);
                return i;
            }
        }

        return -1;
    }
    void imprimirUsDelSistemaDeGuia(String nomThread){
        System.out.println("Nom: " + nomThread);

        System.out.println("Sistema de guia: " + usDelSistemaDeGuia[0] + ", " + usDelSistemaDeGuia[1] + ", " + usDelSistemaDeGuia[2]);
    }

    void alliberarSistemaDeGuia(int numUsDelSistemaDeGuia, String nomThread){
        usDelSistemaDeGuia[numUsDelSistemaDeGuia] = false;
        imprimirUsDelSistemaDeGuia(nomThread);
        semaphore.release();
    }


}
