public class MagatzemCombustible_v1 {
    private char[] posicionsEnMagatzem = {'0','0','0','0','0','0','0','0','0','0'};
    int posicio =-1;

    public char[] getPosicionsEnMagatzem() {
        return posicionsEnMagatzem;
    }

    public void setPosicionsEnMagatzem(char[] posicionsEnMagatzem) {
        this.posicionsEnMagatzem = posicionsEnMagatzem;
    }

    public synchronized int numContenidorsAlMagatzem(){
        int numContenidors;

        numContenidors = posicio + 1;

        return numContenidors;
    }

    public void produirContenidorDeCombustible() {
        if ((-1 <= posicio) && (posicio <= 8)){
            posicio++;

            posicionsEnMagatzem[posicio] = '1';
        }
    }
    public void consumirContenidorDeCombustible() {
        if ((0 <= posicio) && (posicio <= 9)){
            posicionsEnMagatzem[posicio] = '0';

            posicio--;
        }
    }
}
