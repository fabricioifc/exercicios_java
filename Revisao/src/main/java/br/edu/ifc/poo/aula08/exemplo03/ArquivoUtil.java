package br.edu.ifc.poo.aula08.exemplo03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;
import javax.activation.MimetypesFileTypeMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class ArquivoUtil {

    private static final String EXTENSAO = "txt";
    private static final String DESCRICAO = "Apenas arquivos texto (.txt)";

    public static File abrirArquivoTexto() throws FileSystemException, FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(criarFiltro());
        fileChooser.setAcceptAllFileFilterUsed(true);
        // fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos texto", "txt", "text"));

        int retorno = fileChooser.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            validarArquivoTexto(arquivo);
            return arquivo;
        }
        throw new FileNotFoundException("Arquivo não encontrado!");
    }

    private static FileFilter criarFiltro() {
        return new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(EXTENSAO);
            }

            @Override
            public String getDescription() {
                return DESCRICAO;
            }
        };
    }

    private static void validarArquivoTexto(File arquivo) throws FileNotFoundException, FileSystemException {
        if (arquivo == null) {
            throw new FileNotFoundException("Arquivo não existe!");
        }
        if (arquivo.isFile()) {
            String mimes = new MimetypesFileTypeMap().getContentType(arquivo);
            System.out.println(mimes);
            if (mimes == null || !mimes.equals("text/plain")) {
                throw new FileSystemException("Arquivo Inválido!");

            }

        }

    }

    public static void escreverArquivoTexto(File arquivo, String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            bw.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String lerArquivoTexto(File arquivo) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(arquivo));

        StringBuilder sb = new StringBuilder();
        while (in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        return sb.toString();
    }

}
