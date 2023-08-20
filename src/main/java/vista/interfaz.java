package vista;

import analizadores.Lexico;
import analizadores.Sintactico;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import java.util.LinkedList;
import errors.LexicalError;
import errors.SintaxError;
import instructions.Statement;
import utils.Utils;
import utils.AnalyzerResult;

public class interfaz extends javax.swing.JFrame {

    LinkedList<Statement> ast;
    LinkedList<LexicalError> lexErrors;
    LinkedList<SintaxError> sintaxErrors;
    int linea = 1;
    int columna = 1;
    String analizadorActual = "StatPy";
    String ruta_archivo = "";

    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();
        lblAnalizadorActual = new javax.swing.JLabel();
        posicion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnGuardarComo = new javax.swing.JMenuItem();
        menuAnalizador = new javax.swing.JMenu();
        btnStatPy = new javax.swing.JMenuItem();
        btnJson = new javax.swing.JMenuItem();
        btnEjecutar = new javax.swing.JMenu();
        btnReporte = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(816, 454));

        areaCodigo.setColumns(20);
        areaCodigo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        areaCodigo.setRows(5);
        areaCodigo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                areaCodigoCaretUpdate(evt);
            }
        });
        areaCodigo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                areaCodigoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(areaCodigo);

        areaResultado.setEditable(false);
        areaResultado.setColumns(20);
        areaResultado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        areaResultado.setRows(5);
        jScrollPane2.setViewportView(areaResultado);

        lblAnalizadorActual.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblAnalizadorActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAnalizadorActual.setText("StatPy");

        posicion.setEditable(false);
        posicion.setBackground(new java.awt.Color(0,0,0,1));
        posicion.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        posicion.setText("Ln 1, Col 1");
        posicion.setBorder(null);
        posicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnalizadorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnalizadorActual)
                    .addComponent(posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        menuArchivo.setText("Archivo");

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(btnAbrir);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(btnGuardar);

        btnGuardarComo.setText("Guardar Como");
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });
        menuArchivo.add(btnGuardarComo);

        jMenuBar1.add(menuArchivo);

        menuAnalizador.setText("Analizador");

        btnStatPy.setText("StatPy");
        btnStatPy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatPyActionPerformed(evt);
            }
        });
        menuAnalizador.add(btnStatPy);

        btnJson.setText("JSON");
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });
        menuAnalizador.add(btnJson);

        jMenuBar1.add(menuAnalizador);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEjecutarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEjecutarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEjecutarMouseReleased(evt);
            }
        });
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnEjecutar);

        btnReporte.setText("Reporte");
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReporteMousePressed(evt);
            }
        });
        jMenuBar1.add(btnReporte);

        setJMenuBar(jMenuBar1);

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

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        JFileChooser selectorArchivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Valid Files", "sp", "json");
        selectorArchivos.setFileFilter(filtro);
        int resultado = selectorArchivos.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = selectorArchivos.getSelectedFile();
            String contenido = "";
            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivoSeleccionado));
                String line;
                while ((line = lector.readLine()) != null) {
                    contenido += line + "\n";
                }
                lector.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.areaCodigo.setText(contenido);
            ruta_archivo = String.valueOf(archivoSeleccionado);
        }

    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String contenido = this.areaCodigo.getText();

        if (ruta_archivo != "") {
            try {
                FileWriter writer = new FileWriter(ruta_archivo, false);
                writer.write(contenido);
                writer.close();
                System.out.println("Texto agregado al archivo exitosamente.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            JFileChooser selectorArchivos = new JFileChooser();
            int resultado = selectorArchivos.showSaveDialog(this);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivo = selectorArchivos.getSelectedFile();

                try {
                    String rutaArchivo = String.valueOf(archivo);
                    FileWriter escritor = new FileWriter(rutaArchivo);
                    escritor.write(contenido);
                    escritor.close();
                    System.out.println("Archivo creado exitosamente.");
                } catch (IOException e) {
                    System.out.println("Error al crear el archivo: " + e.getMessage());
                }
                ruta_archivo = String.valueOf(archivo);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        String contenido = this.areaCodigo.getText();

        JFileChooser selectorArchivos = new JFileChooser();
        int resultado = selectorArchivos.showSaveDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = selectorArchivos.getSelectedFile();

            try {
                String rutaArchivo = String.valueOf(archivo);
                FileWriter escritor = new FileWriter(rutaArchivo);
                escritor.write(contenido);
                escritor.close();
                System.out.println("Archivo creado exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed

    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnEjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutarMouseClicked

    }//GEN-LAST:event_btnEjecutarMouseClicked

    private void btnEjecutarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutarMouseExited
        this.btnEjecutar.setSelected(false);
    }//GEN-LAST:event_btnEjecutarMouseExited

    private void btnEjecutarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutarMousePressed
        String contenido = this.areaCodigo.getText();

        if (this.analizadorActual.equals("StatPy")) {
            try {
                Lexico scanner = new Lexico(new java.io.StringReader(contenido));
                Sintactico parser = new Sintactico(scanner);
                parser.parse();
                System.out.println("¡Analisis Finalizado!");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (this.analizadorActual.equals("JSON")) {
            System.out.println("JSON");
        }

        //Codigo
        /*
        if (this.analizadorActual.equals("StatPy")) {
            if (ast == null) {
                JOptionPane.showMessageDialog(this, "No se ha ejecutado el archivo", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.areaCodigo.insert(Utils.translatePython(ast), 0);
        } else if (this.analizadorActual.equals("JSON")) {
            System.out.println("JSON");
        }
         */
    }//GEN-LAST:event_btnEjecutarMousePressed

    private void btnEjecutarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutarMouseReleased

    }//GEN-LAST:event_btnEjecutarMouseReleased

    private void areaCodigoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_areaCodigoCaretPositionChanged

    }//GEN-LAST:event_areaCodigoCaretPositionChanged

    private void areaCodigoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_areaCodigoCaretUpdate
        try {
            int caretpos = this.areaCodigo.getCaretPosition();
            linea = this.areaCodigo.getLineOfOffset(caretpos);
            columna = caretpos - this.areaCodigo.getLineStartOffset(linea);
            linea += 1;
            columna += 1;
            this.posicion.setText("Ln " + String.valueOf(linea) + ", Col " + String.valueOf(columna));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_areaCodigoCaretUpdate

    private void btnReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMousePressed

    }//GEN-LAST:event_btnReporteMousePressed

    private void btnReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseExited
        this.btnReporte.setSelected(false);
    }//GEN-LAST:event_btnReporteMouseExited

    private void posicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicionActionPerformed

    }//GEN-LAST:event_posicionActionPerformed

    private void btnStatPyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatPyActionPerformed
        this.analizadorActual = "StatPy";
        this.lblAnalizadorActual.setText(this.analizadorActual);
    }//GEN-LAST:event_btnStatPyActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        this.analizadorActual = "JSON";
        this.lblAnalizadorActual.setText(this.analizadorActual);
    }//GEN-LAST:event_btnJsonActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenu btnEjecutar;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnGuardarComo;
    private javax.swing.JMenuItem btnJson;
    private javax.swing.JMenu btnReporte;
    private javax.swing.JMenuItem btnStatPy;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnalizadorActual;
    private javax.swing.JMenu menuAnalizador;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JTextField posicion;
    // End of variables declaration//GEN-END:variables
}
