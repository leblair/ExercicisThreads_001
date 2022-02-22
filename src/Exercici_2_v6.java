public class Exercici_2_v6 {

    public void inicialitzarPrograma(){

        SistemaDeGuiaDeTorpedes sistemaDeGuiaDeTorpedes = new SistemaDeGuiaDeTorpedes();
        Thread[] threadpare = new Thread[10];
        for(int i =0 ; i<threadpare.length;i++){
            threadpare[i] = new Thread( new Torpede(sistemaDeGuiaDeTorpedes),"Torpede " + i );
            threadpare[i].start();
        }



    }
}
