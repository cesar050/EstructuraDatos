public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ArbolAVL
        ArbolAVL arbol = new ArbolAVL(0, null, null, null);
        arbol.agregar(5);
        arbol.insertar(10);
        arbol.eliminar(5);

        // Crear una instancia de Grafo
        Grafo grafo = new Grafo(0) {
            @Override
            public void agregar(int dato) {
                // Implementar el método agregar para Grafo
            }

            @Override
            public void insertar(int dato) {
                // Implementar el método insertar para Grafo
            }

            @Override
            public void eliminar(int dato) {
                // Implementar el método eliminar para Grafo
            }
        };
        grafo.agregar(3);
        grafo.insertar(7);
        grafo.eliminar(3);
    }
}
