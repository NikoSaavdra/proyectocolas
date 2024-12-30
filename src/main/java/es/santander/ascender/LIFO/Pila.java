package es.santander.ascender.LIFO;

public class Pila {

    private Nodo raiz;

    public void push(String mensaje) {
        if (raiz == null) {
            this.raiz = new Nodo(mensaje);
        } else {
            Nodo nuevoNodo = new Nodo(mensaje); 
            nuevoNodo.setSiguiente(raiz);       // El siguiente del nuevo nodo será la raíz
            raiz = nuevoNodo;                   // La raíz se actualiza al nuevo nodo
        }
    }

    public String pop() {
        if (raiz == null) {
            return null; 
        } else {
            String valor = raiz.getValor();
            raiz = raiz.getSiguiente(); 
            return valor; 
        }
    }
}
