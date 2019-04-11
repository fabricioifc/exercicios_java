package br.edu.ifc.gui.aula13.calculadora;

import java.util.Arrays;
import javax.swing.JTextField;

public class Calculo {

    private String valorAtual = "";
    private String valorAnterior = "";
    private String operador;
    private final JTextField campo;

    public Calculo(JTextField campo) {
        this.campo = campo;
    }

    public boolean podeCalcular(String entrada) {
        if (entrada.equals("=")) {
            return !this.valorAnterior.equals("") && !this.valorAtual.equals("") && !this.operador.equals("");
        }
        return false;
    }

    public void setResultado(String entrada) {
        campo.setText(entrada);
    }

    public void limpar() {
        this.valorAnterior = "";
        this.valorAtual = "";
        this.operador = "";
    }

    public void limparTudo() {
        this.limpar();
        setResultado("");
    }

    public void calcular() {
        Double v1 = Double.parseDouble(valorAnterior);
        Double v2 = Double.parseDouble(valorAtual);
        Double resultado = null;
        switch (operador) {
            case "+":
                resultado = v1 + v2;
                break;
            case "-":
                resultado = v1 - v2;
                break;
            case "*":
                resultado = v1 * v2;
                break;
            case "/":
                resultado = v1 / v2;
                break;
        }
        campo.setText(resultado.toString());
        limpar();

    }

    public void isOperador(String entrada) {
        if (Arrays.asList(new String[]{"+", "-", "*", "/"}).contains(entrada)) {
            setOperador(entrada);
            setValorAnterior(campo.getText());
            setResultado("");
        }
    }

    public void isNumero(String entrada) {
        if (Arrays.asList(new String[]{
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
        }).contains(entrada)) {
            setValorAtual(campo.getText() + entrada);
            setResultado(getValorAtual());
        }
    }

    public String getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(String valorAtual) {
        this.valorAtual = valorAtual;
    }

    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

}
