package br.edu.ifc.sabado02.v1;

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
        super.setSize(450, 70);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initComponentes();
    }

    private void initComponentes() {
        // Cria os componentes
        lblContador = new JLabel("Contador");
        txtContador = new JTextField(contador + "", 10);
        txtContador.setEditable(false);
        btnContador = new JButton("Incrementar");

        // Adiciona os componentes na tela
        super.getContentPane().add(lblContador);
        super.getContentPane().add(txtContador);
        super.getContentPane().add(btnContador);

        btnContador.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++contador;
        txtContador.setText(contador + "");
    }

    public static void main(String[] args) {
        ContadorTela app = new ContadorTela();
        app.setVisible(true);
    }

}
