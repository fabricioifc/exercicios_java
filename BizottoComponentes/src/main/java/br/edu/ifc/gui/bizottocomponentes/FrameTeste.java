package br.edu.ifc.gui.bizottocomponentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class FrameTeste extends javax.swing.JFrame implements ActionListener {

  private ButtonGroup grupo;

  public FrameTeste() {
    initComponents();

    grupo = new ButtonGroup();
    grupo.add(ckFeminino);
    grupo.add(ckMasculino);

    ckMasculino.setObjeto(SexoType.MASCULINO);
    ckFeminino.setObjeto(SexoType.FEMININO);

    ckMasculino.setTextoSelecionado(SexoType.MASCULINO.getTipo() + "");
    ckFeminino.setTextoSelecionado(SexoType.FEMININO.getTipo() + "");

    ckMasculino.addActionListener(this);
    ckFeminino.addActionListener(this);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    ckMasculino = new br.edu.ifc.gui.bizottocomponentes.IfcJCheckBox();
    ckFeminino = new br.edu.ifc.gui.bizottocomponentes.IfcJCheckBox();
    lblTexto = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    ckMasculino.setText("Masculino");

    ckFeminino.setText("Feminino");

    lblTexto.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblTexto.setText("Selecione o Sexo");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(ckMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ckFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ckMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ckFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblTexto)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrameTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrameTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrameTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrameTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrameTeste().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private br.edu.ifc.gui.bizottocomponentes.IfcJCheckBox ckFeminino;
  private br.edu.ifc.gui.bizottocomponentes.IfcJCheckBox ckMasculino;
  private javax.swing.JLabel lblTexto;
  // End of variables declaration//GEN-END:variables

  @Override
  public void actionPerformed(ActionEvent e) {
//    lblTexto.setText(e.getActionCommand());

//    IfcJCheckBox check = (IfcJCheckBox) e.getSource();
//    lblTexto.setText(check.getValorSelecionado());
    IfcJCheckBox check = (IfcJCheckBox) e.getSource();
    SexoType tipoEscolhido = (SexoType) check.getObjetoSelecionado();
    lblTexto.setText(String.valueOf(tipoEscolhido.getTipo()));
  }

}

enum SexoType {
  MASCULINO('M'), FEMININO('F');

  private char tipo;

  SexoType(char tipo) {
    this.tipo = tipo;
  }

  public char getTipo() {
    return tipo;
  }

  public void setTipo(char tipo) {
    this.tipo = tipo;
  }

}
