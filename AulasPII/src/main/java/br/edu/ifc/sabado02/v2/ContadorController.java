package br.edu.ifc.sabado02.v2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorController implements ContadorListener, ActionListener {

    private ContadorTela tela;
    private final ContadorModel modelo;

    public ContadorController(ContadorTela tela, ContadorModel modelo) {
        this.tela = tela;
        this.modelo = modelo;
    }

    @Override
    public void increment() throws Exception {
        int contador = modelo.getContador();
        modelo.setContador(++contador);
    }

    @Override
    public void decrement() throws Exception {
        int contador = modelo.getContador();
        if (contador == 0) {
            throw new Exception("Contador não pode ficar negativo");
        }
        modelo.setContador(--contador);
    }

    public ContadorModel getModelo() {
        return modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            System.out.println(e.getActionCommand());
            if (e.getActionCommand().equals(ContadorTela.BTN_INCREMENTAR)) {
                this.increment();
            } else {
                this.decrement();
            }
            tela.atualizar();
        } catch (Exception ex) {
            tela.mostrarMensagem(ex.getMessage());
        }
    }

}
