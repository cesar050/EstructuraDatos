public abstract class ArbolBinario extends EstructuraDato implements Recorridos {

    private int altura;
    private NodoArbol raiz;
    private NodoArbol ramas;
    private NodoArbol hojas;

    public ArbolBinario(int altura, NodoArbol raiz, NodoArbol ramas, NodoArbol hojas){
        this.altura = altura;
        this.raiz = raiz;
        this.ramas = ramas;
        this.hojas = hojas;
    }

    public void recorrer(){}
    public void insertar(){}
    public void eliminar(){}
}