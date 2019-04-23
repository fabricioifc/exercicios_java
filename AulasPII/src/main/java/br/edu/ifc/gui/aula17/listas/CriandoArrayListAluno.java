package br.edu.ifc.gui.aula17.listas;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Usei a biblioteca Faker (https://github.com/DiUS/java-faker)
 *
 * @author fabricio
 */
public class CriandoArrayListAluno {

    public static void main(String[] args) {
//        Lista de Alunos
        List<Aluno> alunos = new ArrayList<>();

        //Usei a biblioteca Faker (https://github.com/DiUS/java-faker)
        Faker fake = new Faker(new Locale("pt-BR"));

        for (int i = 0; i < 40; i++) {
            Long matricula = fake.number().numberBetween(0L, 100000L);
            String nome = fake.name().fullName();
            Date dtnascimento = fake.date().birthday();
            Double bolsa = fake.number().randomDouble(2, 100, 500);
            boolean matriculado = fake.random().nextBoolean();

            Aluno aluno = new Aluno(matricula, nome,
                    dtnascimento, bolsa, matriculado);
            alunos.add(aluno);
        }
        // Imprimindo a lista
        System.out.println(Arrays.asList(alunos));

        // Ordenando alunos (1)
        alunos.sort(new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return a1.getNome().compareTo(a2.getNome());
            }
        });
        // Ordenando alunos (2)
        alunos.sort(Comparator.comparing(Aluno::getNome));
        // Ordenando alunos (3)
        Collections.sort(alunos, Comparator.comparingLong(Aluno::getMatricula));

        // Imprimindo alunos
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
        // Imprimindo alunos: A partir do JAVA 8
        alunos.forEach((aluno) -> {
            System.out.println(aluno.toString());
        });

    }
}
