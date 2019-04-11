package br.edu.ifc.gui.aula13.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFacilGUI extends JFrame implements ActionListener {

    private JTextField txtResultado;
    private boolean novo = true;
    private final String[] teclas = new String[]{
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };

    Calculo meuCalculo;

    public CalculadoraFacilGUI() {
        super("Calculadora GUI");
        super.setSize(300, 300);

        Container painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4, 2, 2));

        txtResultado = new JTextField();
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 22));
        txtResultado.setEnabled(false);
        // Envia o JTextField para a classe de cálculo
        meuCalculo = new Calculo(txtResultado);

        //Adiciona todos os botões no painel
        for (int i = 0; i < teclas.length; i++) {
            painel.add(criarBotao(teclas[i]));
        }

        Container container = super.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(BorderLayout.NORTH, txtResultado);
        container.add(BorderLayout.CENTER, painel);
        container.add(BorderLayout.SOUTH, criarBotao("Limpar"));
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);

        // Cria uma ação
        ActionListener acao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Diz que a ação será a mesma para todos os botões criados aqui
                CalculadoraFacilGUI.this.actionPerformed(e);
            }
        };
        botao.addActionListener(acao);

        return botao;
    }

    // Implementa a ação para todos os botões
    @Override
    public void actionPerformed(ActionEvent e) {
        String entrada = e.getActionCommand();
        // Se for uma tecla permitida
        if (Arrays.asList(teclas).contains(entrada)) {
            System.out.println(e.getActionCommand());

            meuCalculo.isNumero(entrada);
            meuCalculo.isOperador(entrada);
            if (meuCalculo.podeCalcular(entrada)) {
                meuCalculo.calcular();
            }

            // Senão, se clicar em Limpar
        } else if ("Limpar".equals(entrada)) {
            meuCalculo.limparTudo();
        }
    }

    public static void main(String[] args) {
        CalculadoraFacilGUI frame = new CalculadoraFacilGUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
