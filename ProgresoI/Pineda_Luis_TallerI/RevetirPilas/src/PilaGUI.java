import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PilaGUI {
    private JTextArea txtResultado;
    private JTextField txtElemento;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JPanel pGeneral;
    private JButton ingresarSecuenciaButton;

    private Pila pila = new Pila();
    public PilaGUI() {
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inp = txtElemento.getText();
                try{
                    int valor = Integer.parseInt(inp);
                    pila.apilar(valor, txtResultado);
                    txtElemento.setText("");

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Introduce un numero validos");
                }


            }
        });
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
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("PilaGUI");
        frame.setContentPane(new PilaGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
