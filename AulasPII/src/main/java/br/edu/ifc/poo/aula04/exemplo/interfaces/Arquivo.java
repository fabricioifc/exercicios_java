/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.poo.aula04.exemplo.interfaces;

/**
 *
 * @author fabricio
 */
public interface Arquivo {

    Object importar(String caminhoDoArquivo);
    void exportar(String caminhoDoArquivo);
}
