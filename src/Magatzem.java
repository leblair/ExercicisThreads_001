public class Magatzem {
    public int quantitatRacions = 1000;

    public synchronized void retornarRacions(int numRacions){
        if(Thread.currentThread().getId()==Exercici_1.idThread){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.quantitatRacions += numRacions;
    }

    public synchronized void agafaRacions(int numRacions){
        this.quantitatRacions += numRacions;
    }//

    public int comprovarQuantitatRacions(){
        return this.quantitatRacions;
    }

}
