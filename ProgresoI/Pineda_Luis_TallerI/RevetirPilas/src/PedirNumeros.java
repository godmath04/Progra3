import javax.swing.*;

public class PedirNumeros {
    public int numeros;

    public PedirNumeros(int numeros) {
        this.numeros = numeros;
    }

    //Metodo para pedir numeros

    public void pedirNumero(Pila pila, JTextArea textArea){
        String ingresoNumeros = JOptionPane.showInputDialog("Ingrese los numeros en secuencia separados con un espacio");
        String auxiliar="";

        //Vamos a exminar la cadena ingresada
        for (int i = 0; i < ingresoNumeros.length(); i++){
            //Con charAt extraemos cada caracter
            char caracter = ingresoNumeros.charAt(i);
            //Verificamos que el caracter no sea un espacio en blanco
            if (caracter != ' '){
                //Entonces, es un numero y se almacena como temporal
                auxiliar = auxiliar+caracter;

            }else{
                // Entonces el numero auxiliar lo apilamos
                if (!auxiliar.isEmpty()) {
                    int num = Integer.parseInt(auxiliar);
                    pila.apilar(num, textArea);

                    //Vaciamos el auxiliar
                    auxiliar = "";
                }


            }
        }

    }



}
