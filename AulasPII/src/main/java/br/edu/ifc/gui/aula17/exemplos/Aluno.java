package br.edu.ifc.gui.aula17.exemplos;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author fabricio
 */
public class Aluno {

    private Long matricula;
    private String nome;
    private Date dtnascimento;
    private Double valorBolsa;
    private boolean matriculado;

    public Aluno(Long matricula, String nome, Date dtnascimento,
            Double valorBolsa, boolean matriculado) {
        this.matricula = matricula;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.valorBolsa = valorBolsa;
        this.matriculado = matriculado;
    }

    public Long getIdade() {
        LocalDate dtNascimento = this.dtnascimento.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dtAtual = LocalDate.now();

        Long idade = ChronoUnit.YEARS.between(dtNascimento, dtAtual);
        return idade;
    }

    @Override
    public String toString() {
        return this.matricula
                + " \t " + this.getIdade()
                + " \t " + this.nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

}
