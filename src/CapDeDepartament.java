public class CapDeDepartament implements  Runnable{
    private Magatzem magatzem;
    int movimentRacions;

    public CapDeDepartament(Magatzem magatzem, int movimentRacions) {
        this.magatzem = magatzem;
        this.movimentRacions = movimentRacions;
    }

    public Magatzem getMagatzem() {
        return magatzem;
    }

    public void setMagatzem(Magatzem magatzem) {
        this.magatzem = magatzem;
    }

    public int getMovimentRacions() {
        return movimentRacions;
    }

    public void setMovimentRacions(int movimentRacions) {
        this.movimentRacions = movimentRacions;
    }

    @Override
    public void run() {

        String nomFil = Thread.currentThread().getName();

        System.out.println("    " + nomFil + ".INICI");
        System.out.println("    " + nomFil + ".movimentRacions = "  + movimentRacions);
        System.out.println("    " + nomFil + ".magatzem.comprovarQuantitatRacions() = "  + magatzem.comprovarQuantitatRacions());
        System.out.println("    " + nomFil + ".REALITZO L'OPERACIÓ");

        if(getMovimentRacions()<0){
            magatzem.agafaRacions(getMovimentRacions());
        }else {
            magatzem.retornarRacions(getMovimentRacions());
        }
        System.out.println("    " + nomFil + ".magatzem.comprovarQuantitatRacions() = "  + magatzem.comprovarQuantitatRacions());
        System.out.println("    " + nomFil + ".FI");
    }
}
