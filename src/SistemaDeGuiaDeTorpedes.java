import java.util.concurrent.Semaphore;

public class SistemaDeGuiaDeTorpedes {

    Semaphore semaphore;
    private int numDeTorpedesQuePotGuiarSimultaneament = 3;
    private boolean[] usDelSistemaDeGuia = {false,false,false};

    int adquirirSistemaDeGuia(String nomThread){

        return 0;
    }

    int assignarSistemaDeGuia(String nomThread)  {
        for(int i=0;i<usDelSistemaDeGuia.length;i++){
            if(!usDelSistemaDeGuia[i]){
                try {
                    semaphore.acquire();
                    return i;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }








}
