# Clase-Practica-2
Segunda clase practica de Estructura de Datos. Lista simplemente enlazada

Trabajé con una lista simplemente enlazada en Java e implementé tres operaciones:

1. Eliminar los elementos repetidos de la lista (me quedo con la primera vez que aparece cada uno).
2. Rotar los elementos una posición a la derecha. Por ejemplo, A-B-C-D queda D-A-B-C.
3. Concatenar dos listas. Por ejemplo, A-B-C-D y E-F-G-H dan A-B-C-D-E-F-G-H.

## Archivos

- Nodo.java: el nodo de la lista, con el dato y el enlace al siguiente.
- ListaEnlazada.java: la lista con los métodos de la práctica.
- Main.java: pruebas de los tres ejercicios con los ejemplos del enunciado.

## Se ejecuta desde Main.java

## Cómo lo resolví

- *Eliminar repetidos:* con dos punteros, uno que va fijando cada elemento y otro que recorre el resto de la lista. Si encuentra uno igual, lo salta cambiando el enlace del nodo anterior.
- *Rotar:* busco el penúltimo nodo, lo dejo apuntando a null, y el último nodo pasa a ser la nueva cabeza apuntando a la anterior.
- *Concatenar:* recorro la primera lista hasta el último nodo y lo enlazo con la cabeza de la segunda.
