/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.archivos;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author edanP
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarioTField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreTField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidoTField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nacimientoTField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        alternoTField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telefonoTField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fotoTField = new javax.swing.JTextField();
        fotoButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contraseñaTField = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Registro");

        jLabel3.setText("Usuario");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Fecha nacimiento");

        jLabel8.setText("Correo alterno");

        jLabel9.setText("Teléfono");

        jLabel10.setText("Fotografía");

        fotoButton.setText("Seleccionar");

        jButton1.setText("REGISTRARSE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fotoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreTField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usuarioTField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(contraseñaTField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(apellidoTField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacimientoTField)
                                    .addComponent(alternoTField)
                                    .addComponent(telefonoTField)
                                    .addComponent(fotoTField))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usuarioTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidoTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contraseñaTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nacimientoTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(alternoTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telefonoTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fotoTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fotoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        Object[] validacion = validarContraseña(new String(contraseñaTField.getPassword()));
        
        if (usuarioTField.getText().length() < 20
                && nombreTField.getText().length() < 30
                && apellidoTField.getText().length() < 30
                && (Boolean)validacion[0] == true
                && contieneUsuario(new String(contraseñaTField.getPassword())) == false
                && validarFecha(nacimientoTField.getText()) == true
                && alternoTField.getText().length() < 40
                && fotoTField.getText().length() < 182) {
            // registro correcto
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO\nSEGURIDAD DE CONTRASEÑA: " + validacion[1].toString());
        } else {
            JOptionPane.showMessageDialog(null, "CAMPOS INVÁLIDOS\n" + FormatFields(validacion[1].toString()));
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private boolean validarFecha(String input) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Formato válido
            format.parse(input);
            return true;
        } catch (ParseException e) {
            // fallo en la conversión
            return false;
        }
    }

    private String FormatFields(String nivel) {
        String error = "";
        if (usuarioTField.getText().length() > 20) {
            error += "El campo \"Usuario\" debe tener 20 caracteres como máximo\n";
        }
        if (nombreTField.getText().length() > 30) {
            error += "El campo \"Nombre\" debe tener 30 caracteres como máximo\n";
        }
        if (apellidoTField.getText().length() > 30) {
            error += "El campo \"Apellido\" debe tener 30 caracteres como máximo\n";
        }
        if (contraseñaTField.getPassword().length > 40 || contraseñaTField.getPassword().length < 8) {
            error += "El campo \"Contraseña\" debe tener 8-40 caracteres\n";
        }
        if (nivel.equals("DEBIL")) {
            error += "CONTRASEÑA DÉBIL";
        }
        if (validarFecha(nacimientoTField.getText()) == false) {
            error += "El campo \"Fecha nacimiento\" debe tener el formato dd/MM/yyyy\n";
        }
        if (alternoTField.getText().length() > 40) {
            error += "El campo \"Correo alterno\" debe tener 40 caracteres como máximo\n";
        }
        if (fotoTField.getText().length() > 40) {
            error += "Ruta inválida para la foto de perfil\n";
        }
        if (contieneUsuario(new String(contraseñaTField.getPassword())) == true) {
            error += "La contraseña contiene el nombre de usuario\n";
        }
        return error;
    }

    private Object[] validarContraseña(String input) {
        File obj = new File("C:\\MEIA\\SecurityLevel.txt");
        System.out.println(input);
        String response = "";
        
        if (obj.exists()) {
            FileReader lectura;

            try {
                //crear el lector
                lectura = new FileReader(obj);
                BufferedReader reader = new BufferedReader(lectura);
                String linea = "";

                try {
                    linea = reader.readLine();
                    String[] split;

                    while (linea != null) {
                        if (!"".equals(linea)) {
                            split = linea.split("\\|");

                            // comparar entrada contra regex 
                            if (Pattern.matches(split[0], input)) {
                                response = split[1];
                                break;
                            }
                        }
                        linea = reader.readLine();
                    }

                    if ("".equals(response)) {
                        response = "LONGITUD INVÁLIDA PARA LA CONTRASEÑA";
                        System.out.println(response);
                        return new Object[]{false, response};
                    }              
                    
                    if ("DEBIL".equals(response)) {
                        return new Object[]{false, response};
                    }

                    lectura.close();
                    reader.close();
                    System.out.println(response);
                    return new Object[]{true, response};
                } catch (IOException ex) {
                    response = ex.getMessage();
                    System.out.println(response);
                    return new Object[]{false, response};
                }
            } catch (FileNotFoundException ex) {
                // archivo no encontrado
                response = ex.getMessage();
                System.out.println(response);
                return new Object[]{false, response};
            }
        }else {
            return new Object[]{false, response};
        }
    }
    
    private boolean contieneUsuario(String input){
        input = input.toLowerCase();
        
        if (input.contains(usuarioTField.getText().toLowerCase())) {
            return true; 
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alternoTField;
    private javax.swing.JTextField apellidoTField;
    private javax.swing.JPasswordField contraseñaTField;
    private javax.swing.JButton fotoButton;
    private javax.swing.JTextField fotoTField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacimientoTField;
    private javax.swing.JTextField nombreTField;
    private javax.swing.JTextField telefonoTField;
    private javax.swing.JTextField usuarioTField;
    // End of variables declaration//GEN-END:variables
}
