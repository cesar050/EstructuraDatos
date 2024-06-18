public abstract class  EstructuraDato {
    // Atributos
    protected int dato;

    public EstructuraDato(int dato) {
    }

    // Metodos
    public abstract void agregar(int dato);
    public abstract void insertar(int dato);
    public abstract void eliminar(int dato);

    // Getters y Setters
    public int getDato() {
        return dato;
    }



}
