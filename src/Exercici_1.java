public class Exercici_1 {
    static float idThread;

    public static void inicialitzarPrograma() throws InterruptedException {
        Magatzem magatzem = new Magatzem();
        CapDeDepartament comandament = new CapDeDepartament(magatzem,100);
        CapDeDepartament armes = new CapDeDepartament(magatzem,100);
        CapDeDepartament timo_i_navegacio = new CapDeDepartament(magatzem,-30);
        CapDeDepartament enginyeria = new CapDeDepartament(magatzem,1000);
        CapDeDepartament ciencia = new CapDeDepartament(magatzem,-50);


        Thread thread1 = new Thread(comandament);
        idThread = thread1.getId();
        //thread1.setName("1");
        Thread thread2 = new Thread(armes,"2");
        Thread thread3 = new Thread(timo_i_navegacio,"3");
        Thread thread4 = new Thread(enginyeria,"4");
        Thread thread5 = new Thread(ciencia,"5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println("Racions disponibles al magatzem: " + magatzem.comprovarQuantitatRacions());
    }

}
