package br.edu.ifc.gui.bizottocomponentes;

import javax.swing.JCheckBox;

public class IfcJCheckBox extends JCheckBox {

  private String textoSelecionado = "S";
  private String textoNaoSelecionado = "N";
  private Object objeto;

  public IfcJCheckBox() {
    initComponents();
  }

  public IfcJCheckBox(String texto, Boolean selecionado) {
    this();
    this.setText(texto);
    this.setSelected(selecionado);
  }

  public String getValorSelecionado() {
    if (this.isSelected()) {
      return this.textoSelecionado;
    } else {
      return this.textoNaoSelecionado;
    }
  }

  public Object getObjetoSelecionado() {
    return isSelected() ? objeto : null;
  }

  public String getTextoSelecionado() {
    return textoSelecionado;
  }

  public void setTextoSelecionado(String textoSelecionado) {
    this.textoSelecionado = textoSelecionado;
  }

  public String getTextoNaoSelecionado() {
    return textoNaoSelecionado;
  }

  public void setTextoNaoSelecionado(String textoNaoSelecionado) {
    this.textoNaoSelecionado = textoNaoSelecionado;
  }

  public Object getObjeto() {
    return objeto;
  }

  public void setObjeto(Object objeto) {
    this.objeto = objeto;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  // End of variables declaration//GEN-END:variables
}
