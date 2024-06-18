public class NodoArbol extends Nodo {
    private int nivel;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    // Constructor de la clase NodoArbol
    public NodoArbol(int dato, NodoArbol izquierdo, NodoArbol derecho) {
        this.nivel = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }
    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }
    public NodoArbol getDerecho() {
        return derecho;
    }
    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
    // Método para mostrar el valor del nodo
    @Override
    public void mostrarValor() {

    }
}
