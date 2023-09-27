package applistacircular;

public class Celula {

    private int valor;
    private Celula proximo;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula() {
    }

    public Celula(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValor());
    }
}
