/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package models.Gui;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Classes.Ator;
import models.Classes.Diretor;
import models.Classes.Pais;
import models.Classes.ProfissionalCinematografico;
import models.Daos.AtorDao;
import models.Daos.DiretorDao;
import models.Daos.PaisDao;
import models.Daos.ProfissionalCinematograficoDao;

/**
 *
 * @author loren
 */
public class CadastroArtista extends javax.swing.JInternalFrame {

    private static CadastroArtista instance;
    
    private DefaultComboBoxModel<Pais> lstPaisModel;
    private int indicePaisSelecionado;

    /**
     * Creates new form CadastroPaciente
     */
    private CadastroArtista() {
        lstPaisModel = new DefaultComboBoxModel<>();
        List<Pais> paises = new PaisDao().findAll();
        lstPaisModel.addAll(paises);
        initComponents();
    }
    
    public static CadastroArtista getInstance() {
        if(instance == null) {
            instance = new CadastroArtista();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblApelido = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        cbxPais = new javax.swing.JComboBox<>();
        txtGenero = new javax.swing.JTextField();
        chkAtor = new javax.swing.JCheckBox();
        pnlDiretor2 = new javax.swing.JPanel();
        chkPrincipal = new javax.swing.JCheckBox();
        chkFotografia = new javax.swing.JCheckBox();
        chkArte = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArtista = new javax.swing.JList<>();
        lblGenero = new javax.swing.JLabel();
        pnlAtor = new javax.swing.JPanel();
        chkProtagonista = new javax.swing.JCheckBox();
        chkDiretor = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblNome.setText("Nome:");

        lblApelido.setText("Apelido:");

        lblPais.setText("País:");

        cbxPais.setModel(lstPaisModel);

        chkAtor.setText("Ator");

        chkPrincipal.setText("Principal");

        chkFotografia.setText("Fotografia");

        chkArte.setText("Arte");

        javax.swing.GroupLayout pnlDiretor2Layout = new javax.swing.GroupLayout(pnlDiretor2);
        pnlDiretor2.setLayout(pnlDiretor2Layout);
        pnlDiretor2Layout.setHorizontalGroup(
            pnlDiretor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiretor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDiretor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPrincipal)
                    .addComponent(chkFotografia)
                    .addComponent(chkArte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDiretor2Layout.setVerticalGroup(
            pnlDiretor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiretor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkFotografia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkArte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstArtista);

        lblGenero.setText("Genero:");

        chkProtagonista.setText("Protagonista");

        javax.swing.GroupLayout pnlAtorLayout = new javax.swing.GroupLayout(pnlAtor);
        pnlAtor.setLayout(pnlAtorLayout);
        pnlAtorLayout.setHorizontalGroup(
            pnlAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkProtagonista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAtorLayout.setVerticalGroup(
            pnlAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkProtagonista)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        chkDiretor.setText("Diretor");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Artistas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblApelido)
                            .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtApelido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(lblGenero)
                                .addGap(22, 22, 22)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkDiretor)
                                .addGap(149, 149, 149)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(pnlAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkAtor))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(pnlDiretor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApelido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPais))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDiretor)
                    .addComponent(chkAtor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlDiretor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            new ProfissionalCinematograficoDao().saveOrUpdate(
                new ProfissionalCinematografico(
                    null,
                    txtNome.getText(),
                    txtApelido.getText(),
                    cbxPais.getItemAt(indicePaisSelecionado),
                    txtGenero.getText()));
            new DiretorDao().saveOrUpdate(
                new Diretor(
                    chkPrincipal.isSelected(),
                    chkFotografia.isSelected(),
                    chkArte.isSelected()));
            new AtorDao().saveOrUpdate(
                new Ator (
                    chkProtagonista.isSelected()));
        } catch (Exception ex) {
            Logger.getLogger(CadastroArtista.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Record not saved.\nCheck the data or the network connection and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        txtNome.setText(null);
        txtNome.requestFocus();
        txtApelido.setText(null);
        txtGenero.setText(null);
        //        Diretor artista = new Diretor();
        //        artista.setNome(txtNome.getText());
        //        artista.setApelido(txtApelido.getText());
        //        Pais pais = new Pais();
        ////        artista.setNacionalidade(txtPais.getText());
        //        artista.setGenero(txtGenero.getText());
        //
        //
        //        Long id = new DiretorDao().saveOrUpdate(artista);
        //        artista.setId(id);
        //
        //        lstArtistasModel.addElement(artista);

    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Pais> cbxPais;
    private javax.swing.JCheckBox chkArte;
    private javax.swing.JCheckBox chkAtor;
    private javax.swing.JCheckBox chkDiretor;
    private javax.swing.JCheckBox chkFotografia;
    private javax.swing.JCheckBox chkPrincipal;
    private javax.swing.JCheckBox chkProtagonista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPais;
    private javax.swing.JList<String> lstArtista;
    private javax.swing.JPanel pnlAtor;
    private javax.swing.JPanel pnlDiretor2;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
