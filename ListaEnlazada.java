public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // agrega al final de la lista
    public void insertarFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    // 1. eliminar repetidos (se queda con la primera vez que aparece)
    public void eliminarRepetidos() {
        Nodo actual = cabeza;
        while (actual != null) {
            Nodo anterior = actual;
            Nodo aux = actual.siguiente;
            while (aux != null) {
                if (aux.dato.equals(actual.dato)) {
                    // es repetido, lo salto
                    anterior.siguiente = aux.siguiente;
                } else {
                    anterior = aux;
                }
                aux = aux.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    // 2. rotar una posicion a la derecha: A-B-C-D -> D-A-B-C
    public void rotarDerecha() {
        // si esta vacia o tiene un solo elemento no hay nada que rotar
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }
        Nodo penultimo = cabeza;
        while (penultimo.siguiente.siguiente != null) {
            penultimo = penultimo.siguiente;
        }
        Nodo ultimo = penultimo.siguiente;
        penultimo.siguiente = null;
        ultimo.siguiente = cabeza;
        cabeza = ultimo;
    }

    // 3. concatenar: A-B-C-D + E-F-G-H -> A-B-C-D-E-F-G-H
    public void concatenar(ListaEnlazada otra) {
        if (otra.cabeza == null) {
            return;
        }
        if (cabeza == null) {
            cabeza = otra.cabeza;
            return;
        }
        Nodo aux = cabeza;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = otra.cabeza;
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.print(aux.dato);
            if (aux.siguiente != null) {
                System.out.print("-");
            }
            aux = aux.siguiente;
        }
        System.out.println();
    }
}
