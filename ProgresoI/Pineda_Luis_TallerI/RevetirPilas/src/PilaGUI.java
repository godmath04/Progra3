import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PilaGUI {
    private JTextArea txtResultado;
    private JTextField txtElemento;
    private JButton invertirSecuenciaButton;
    private JButton desapilarButton;
    private JPanel pGeneral;
    private JButton ingresarSecuenciaButton;
    private JTextArea txtInvertido;

    private Pila pila = new Pila();
    public PilaGUI() {
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.desapilar(txtResultado);
            }
        });
        ingresarSecuenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PedirNumeros solicitar = new PedirNumeros(0);
                solicitar.pedirNumero(pila, txtResultado);

            }
        });
        invertirSecuenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.invertirPila(txtInvertido);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("PilaGUI");
        frame.setContentPane(new PilaGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
