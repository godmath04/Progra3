import javax.swing.*;

public class Pila {
    public Nodo cima;
    public int tamano;

    // Constructor es vacio porque va dinamica
    public Pila(){
        cima = null;
        tamano = 0;
    }

    //Mando el dato y el area a visualizar
    public void apilar(int dato, JTextArea textArea){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamano++;
        actualizarTextArea(textArea);
    }

    //Reviso si la cima esta vacia
    public boolean estaVacia(){
        return cima == null;
    }

    //Desapilar
    public int desapilar (JTextArea textArea){
        if (estaVacia()){
            JOptionPane.showMessageDialog(null, "la pila esta vacia");
            return -1;
        }

        //Obtener el dato de la cima
        int dato = cima.dato;

        //Cima se actualiza para que apunte al siguiente nodo en la pila
        //elimina el nodo de la cima
        cima = cima.siguiente;
        tamano--;
        actualizarTextArea(textArea);

        //Devuelve el dato antes de ser eliminado
        return dato;
    }

    //Mostrr pila
    public void mostrarPila(JTextArea textArea){
        if (estaVacia()){
            textArea.setText(("La pila esta vacia"));
        }else{
            StringBuilder pilaStr = new StringBuilder();
            Nodo actual = cima;
            while (cima != null){
                pilaStr.append(actual.dato).append("\n");
                actual = actual.siguiente;
            }
            textArea.setText(pilaStr.toString());
        }
    }

    public void actualizarTextArea(JTextArea textArea){
        mostrarPila(textArea);
    }



}
