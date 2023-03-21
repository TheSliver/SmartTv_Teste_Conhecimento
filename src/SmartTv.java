public class SmartTv {
    int canal = 5;
    int volume = 10;
    boolean isLigado = false;

    public void setCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void setLigado() {
        isLigado = true;
    }
    public void setDesligado() {
        isLigado = false;
    }
    public void aumentaVolume() {
        volume ++;
    }
    public void diminuirVolume() {
        volume --;
    }
    public void aumentaCanal() {
        canal ++;
    }
    public void diminuirCanal() {
        canal --;
    }
}
