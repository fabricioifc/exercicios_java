package br.edu.ifc.poo.aula10.prova.emprestimos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmprestimoBancario {

    public static void main(String[] args) {
        // Nome e CPF
        Pessoa p1 = new Pessoa(
                "Carlos", 56487451233L
        );
        //Salário, nome e CPF
        Funcionario f1 = new Funcionario(
                2500.0, "Fernando", 96547841254L
        );
        // Departamento, salário, nome e CPF
        ChefeDeDepartamento c1 = new ChefeDeDepartamento(
                "Analista de Sistemas", 6500.0, "Rosane", 64976154673L
        );

        //Calculando o empréstimo
        System.out.println(calcularEmprestimo(p1));
        System.out.println(calcularEmprestimo(f1));
        System.out.println(calcularEmprestimo(c1));

    }

    public static Double calcularEmprestimo(Pessoa p) {
        Double valor = null;

        if (p instanceof ChefeDeDepartamento) {
            ChefeDeDepartamento objeto = (ChefeDeDepartamento) p;
            valor = objeto.getSalario() * 4.0;
        } else if (p instanceof Funcionario) {
            Funcionario objeto = (Funcionario) p;
            valor = objeto.getSalario() * 2.0;
        } else if (p instanceof Pessoa) {
            valor = 1000D;
        }

        return valor;
    }
}
