package br.edu.ifc.sabado02.v2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ContadorTela extends JFrame {

    private JLabel lblContador;
    private JTextField txtContador;
    private JButton btnIncrementar;
    private JButton btnDecrementar;
    private final ContadorController controlador;
    private final ContadorModel modelo;

    //Constantes para o texto do botão
    public static final String BTN_INCREMENTAR = "+";
    public static final String BTN_DECREMENTAR = "-";

    public ContadorTela() {
        super("Contador");
        super.setLayout(new FlowLayout());
        super.setSize(450, 75);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        modelo = new ContadorModel();
        controlador = new ContadorController(this, modelo);

        initComponentes();
    }

    private void initComponentes() {
        lblContador = new JLabel("Contador");
        txtContador = new JTextField("", 10);
        txtContador.setEditable(false);
        btnIncrementar = new JButton(ContadorTela.BTN_INCREMENTAR);
        btnDecrementar = new JButton(ContadorTela.BTN_DECREMENTAR);

        super.getContentPane().add(lblContador);
        super.getContentPane().add(txtContador);
        super.getContentPane().add(btnIncrementar);
        super.getContentPane().add(btnDecrementar);

        btnIncrementar.addActionListener(controlador);
        btnDecrementar.addActionListener(controlador);

        //Atualizar os valores
        atualizar();
    }

    public void atualizar() {
//        btnDecrementar.setEnabled(controlador.getModelo().getContador() > 0);
        txtContador.setText(controlador.getModelo().getContador() + "");
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
