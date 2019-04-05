package br.edu.ifc.sabado02.v1;

import br.edu.ifc.sabado02.v2.ContadorController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ContadorTela extends JFrame implements ActionListener {

    private JLabel lblContador;
    private JTextField txtContador;
    private JButton btnContador;

    private int contador = 0;

    public ContadorTela() {
        super("Contador");
        super.setLayout(new FlowLayout());
        super.setSize(250, 100);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initComponentes();
    }

    private void initComponentes() {
        lblContador = new JLabel("Contador");
        txtContador = new JTextField(contador + "", 10);
        txtContador.setEditable(false);
        btnContador = new JButton("Incrementar");

        super.getContentPane().add(lblContador);
        super.getContentPane().add(txtContador);
        super.getContentPane().add(btnContador);

        btnContador.addActionListener(this);
    }

    public void increment() throws Exception {
        ++contador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            System.out.println(e.getActionCommand());
            this.increment();
            txtContador.setText(contador + "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ContadorTela app = new ContadorTela();
        app.setVisible(true);
    }

}
