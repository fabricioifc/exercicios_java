package br.edu.ifc.poo.aula08.exemplo03;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        try {

            //Escrevendo no arquivo
            File arquivo = new File("/home/fabricio/teste.txt");
            ArquivoUtil.escreverArquivoTexto(arquivo,
                    "Olá Mundo!\n\nEstou escrevendo no arquivo texto!");

            //Buscando um arquivo texto
            arquivo = ArquivoUtil.abrirArquivoTexto();

            //Lendo o arquivo texto
            String texto = ArquivoUtil.lerArquivoTexto(arquivo);

            //Imprimindo o arquivo texto
            System.out.println(texto);
        } catch (FileSystemException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
