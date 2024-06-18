import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL(0, null, null, null);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar");
            System.out.println("2. Insertar");
            System.out.println("3. Eliminar");
            System.out.println("4. Recorrer (inOrden)");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a agregar:");
                    int valorAgregar = scanner.nextInt();
                    arbol.agregar(valorAgregar);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a insertar:");
                    int valorInsertar = scanner.nextInt();
                    arbol.insertar(valorInsertar);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a eliminar:");
                    int valorEliminar = scanner.nextInt();
                    arbol.eliminar(valorEliminar);
                    break;
                case 4:
                    System.out.println("Recorrido inOrden:");
                    arbol.inOrden();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}