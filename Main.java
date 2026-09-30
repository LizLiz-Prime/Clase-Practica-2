public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: eliminar repetidos
        ListaEnlazada lista = new ListaEnlazada();
        String[] datos = {"A", "B", "A", "C", "B", "D", "D"};
        for (String d : datos) {
            lista.insertarFinal(d);
        }
        System.out.print("Lista original: ");
        lista.mostrar();
        lista.eliminarRepetidos();
        System.out.print("Sin repetidos: ");
        lista.mostrar();

        // Ejercicio 2: rotar a la derecha
        lista.rotarDerecha();
        System.out.print("Rotada a la derecha: ");
        lista.mostrar();

        // Ejercicio 3: concatenar
        ListaEnlazada lista1 = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada();
        String[] d1 = {"A", "B", "C", "D"};
        String[] d2 = {"E", "F", "G", "H"};
        for (String d : d1) {
            lista1.insertarFinal(d);
        }
        for (String d : d2) {
            lista2.insertarFinal(d);
        }
        lista1.concatenar(lista2);
        System.out.print("Concatenadas: ");
        lista1.mostrar();
    }
}

// Liz Lopez <3