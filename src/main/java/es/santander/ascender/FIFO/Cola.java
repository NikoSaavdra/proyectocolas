package es.santander.ascender.FIFO;

public class Cola {

    private Nodo raiz;

    public void add(String mensaje) {
        if (raiz == null) {
            this.raiz = new Nodo(mensaje);
        } else {
            this.raiz.pedirLaVez(mensaje);
        }
    }

    public String get() {
        if (raiz == null) {
            return null;
        } else {
            String valor = raiz.getValor();
            raiz = raiz.getSiguiente();
            return valor;
        }
    }
}
