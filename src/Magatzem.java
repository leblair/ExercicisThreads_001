public class Magatzem {
    public int quantitatRacions = 1000;

    public void retornarRacions(int numRacions){
        if(Thread.currentThread().getId()== 1){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.quantitatRacions += numRacions;
    }

    public void agafaRacions(int numRacions){
        this.quantitatRacions -= numRacions;
    }

    public int comprovarQuantitatRacions(int numRacions){
        return this.quantitatRacions;
    }


}
