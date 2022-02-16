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

    @Override
    public void run() {

    }
}
