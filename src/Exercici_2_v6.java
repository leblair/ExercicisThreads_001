public class Exercici_2_v6 {

    public static void inicialitzarPrograma(){

        SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes = new SistemaDeGuiaDeTorpedes();
        Thread[] threadpare = new Thread[10];
        for(int i =0 ; i<threadpare.length;i++){
            threadpare[i] = new Thread( new Torpede(sistemaDeGuiaDeTorpedes),"Torpede " + i );
            System.out.println("Inici: ");
            threadpare[i].start();
        }
        for(Thread thread: threadpare){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fi");


    }
}
