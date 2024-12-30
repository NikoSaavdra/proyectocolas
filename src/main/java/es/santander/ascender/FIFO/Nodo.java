package es.santander.ascender.FIFO;

public class Nodo {
    private String valor;
    private Nodo siguiente;

    public Nodo(String valor) {
        this.valor = valor;
    }

    public void pedirLaVez(String mensaje) {
        if (siguiente == null) {
            siguiente = new Nodo(mensaje);
        } else {
            this.siguiente.pedirLaVez(mensaje);
        }
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
