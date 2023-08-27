package view;

import analyzersJSON.LexicalJSON;
import analyzersJSON.SyntacticJSON;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.LinkedList;
import errors.LexicalError;
import errors.SintaxError;
import instructions.Statement;
import instructions.Variable;
import java.awt.Desktop;
import tokens.Tokens;
import utils.Utils;
import utils.AnalyzerResult;
import reports.ErrorsReport;
import reports.TokensReport;

public class Interface extends javax.swing.JFrame {

    LinkedList<Statement> ast;
    LinkedList<LexicalError> lexErrorsStatPy;
    LinkedList<SintaxError> sintaxErrorsStatPy;
    LinkedList<LexicalError> lexErrorsJSON;
    LinkedList<SintaxError> sintaxErrorsJSON;
    LinkedList<Tokens> tokensStatPy;
    LinkedList<Tokens> tokensJSON;
    LinkedList<Variable> variables_json = new LinkedList<>();
    int line = 1;
    int column = 1;
    String currentAnalyzer = "StatPy";
    String path_file = "";

    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCode = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResult = new javax.swing.JTextArea();
        lblCurrentAnalyzer = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        btnOpen = new javax.swing.JMenuItem();
        btnSave = new javax.swing.JMenuItem();
        btnSaveAs = new javax.swing.JMenuItem();
        menuAnalyzer = new javax.swing.JMenu();
        btnStatPy = new javax.swing.JMenuItem();
        btnJson = new javax.swing.JMenuItem();
        btnRun = new javax.swing.JMenu();
        btnReport = new javax.swing.JMenu();
        btnTokensReport = new javax.swing.JMenuItem();
        btnErrorsReport = new javax.swing.JMenuItem();
        btnHelp = new javax.swing.JMenu();
        btnUserManual = new javax.swing.JMenuItem();
        btnTechManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(816, 454));

        areaCode.setColumns(20);
        areaCode.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        areaCode.setRows(5);
        areaCode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                areaCodeCaretUpdate(evt);
            }
        });
        areaCode.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                areaCodeCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(areaCode);

        areaResult.setEditable(false);
        areaResult.setColumns(20);
        areaResult.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        areaResult.setRows(5);
        jScrollPane2.setViewportView(areaResult);

        lblCurrentAnalyzer.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblCurrentAnalyzer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurrentAnalyzer.setText("StatPy");

        position.setEditable(false);
        position.setBackground(new java.awt.Color(0,0,0,1));
        position.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        position.setText("Ln 1, Col 1");
        position.setBorder(null);
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
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
                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCurrentAnalyzer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(lblCurrentAnalyzer)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        menuFile.setText("Archivo");

        btnOpen.setText("Abrir");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        menuFile.add(btnOpen);

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        menuFile.add(btnSave);

        btnSaveAs.setText("Guardar Como");
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(btnSaveAs);

        jMenuBar1.add(menuFile);

        menuAnalyzer.setText("Analizador");

        btnStatPy.setText("StatPy");
        btnStatPy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatPyActionPerformed(evt);
            }
        });
        menuAnalyzer.add(btnStatPy);

        btnJson.setText("JSON");
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });
        menuAnalyzer.add(btnJson);

        jMenuBar1.add(menuAnalyzer);

        btnRun.setText("Ejecutar");
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRunMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRunMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRunMouseReleased(evt);
            }
        });
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnRun);

        btnReport.setText("Reporte");
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReportMousePressed(evt);
            }
        });

        btnTokensReport.setText("Tokens");
        btnTokensReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTokensReportActionPerformed(evt);
            }
        });
        btnReport.add(btnTokensReport);

        btnErrorsReport.setText("Errores");
        btnErrorsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorsReportActionPerformed(evt);
            }
        });
        btnReport.add(btnErrorsReport);

        jMenuBar1.add(btnReport);

        btnHelp.setText("Ayuda");

        btnUserManual.setText("Manual de Usuario");
        btnUserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManualActionPerformed(evt);
            }
        });
        btnHelp.add(btnUserManual);

        btnTechManual.setText("Manual Tecnico");
        btnTechManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechManualActionPerformed(evt);
            }
        });
        btnHelp.add(btnTechManual);

        jMenuBar1.add(btnHelp);

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

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        JFileChooser file_chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Valid Files", "sp", "json");
        file_chooser.setFileFilter(filter);
        int result = file_chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = file_chooser.getSelectedFile();
            String content = "";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(archivoSeleccionado));
                String line;
                while ((line = reader.readLine()) != null) {
                    content += line + "\n";
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.areaCode.setText(content);
            path_file = String.valueOf(archivoSeleccionado);
            this.lexErrorsStatPy = null;
            this.sintaxErrorsStatPy = null;
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String content = this.areaCode.getText();

        if (path_file != "") {
            try {
                FileWriter writer = new FileWriter(path_file, false);
                writer.write(content);
                writer.close();
                JOptionPane.showMessageDialog(this, "¡Archivo guardado exitosamente!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "¡Error al guardar el archivo!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JFileChooser file_chooser = new JFileChooser();
            int result = file_chooser.showSaveDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = file_chooser.getSelectedFile();

                try {
                    String pathFile = String.valueOf(file);
                    FileWriter writer = new FileWriter(pathFile);
                    writer.write(content);
                    writer.close();
                    JOptionPane.showMessageDialog(this, "¡Archivo creado exitosamente!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "¡Error al crear el archivo!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                path_file = String.valueOf(file);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed
        String content = this.areaCode.getText();

        JFileChooser file_chooser = new JFileChooser();
        int result = file_chooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = file_chooser.getSelectedFile();

            try {
                String pathFile = String.valueOf(file);
                FileWriter writer = new FileWriter(pathFile);
                writer.write(content);
                writer.close();
                JOptionPane.showMessageDialog(this, "¡Archivo creado exitosamente!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "¡Error al crear el archivo!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnSaveAsActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed

    }//GEN-LAST:event_btnRunActionPerformed

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked

    }//GEN-LAST:event_btnRunMouseClicked

    private void btnRunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseExited
        this.btnRun.setSelected(false);
    }//GEN-LAST:event_btnRunMouseExited

    private void btnRunMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMousePressed
        this.areaResult.setText("");
        String content = this.areaCode.getText();
        /*
        if (this.currentAnalyzer.equals("StatPy")) {
            try {
                Lexico scanner = new Lexico(new java.io.StringReader(contenido));
                Sintactico parser = new Sintactico(scanner);
                parser.parse();
                System.out.println("¡Analisis Finalizado!");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (this.currentAnalyzer.equals("JSON")) {
            System.out.println("JSON");
        }
         */
        //Codigo
        if (this.currentAnalyzer.equals("StatPy")) {
            try {
                AnalyzerResult result = Utils.analyzerFileStatPy(content, variables_json);
                this.ast = result.ast;
                this.lexErrorsStatPy = result.lexErrors;
                this.tokensStatPy = result.tokens;
                this.sintaxErrorsStatPy = result.sintaxErrors;

                if (!lexErrorsStatPy.isEmpty() || !sintaxErrorsStatPy.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Se han encontrado errores en la entrada", "Error", JOptionPane.WARNING_MESSAGE);

                    ErrorsReport lexicalErrorsReport = new ErrorsReport();
                    String content_html_errors = lexicalErrorsReport.generateErrorsReport(lexErrorsStatPy);

                    try {
                        FileWriter writer = new FileWriter("./src/main/java/reports/erroresStatPy.html");
                        writer.write(content_html_errors);
                        writer.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "¡Error al crear el archivo de reporte!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    TokensReport all_tokens = new TokensReport();
                    String content_html_tokens = all_tokens.generateTokenReport(tokensStatPy);

                    try {
                        FileWriter writer = new FileWriter("./src/main/java/reports/tokensStatPy.html");
                        writer.write(content_html_tokens);
                        writer.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "¡Error al crear el archivo de reporte!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    if (ast == null) {
                        JOptionPane.showMessageDialog(this, "No se ha ejecutado el archivo", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    this.areaResult.insert(Utils.translatePython(ast), 0);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            }

        } else if (this.currentAnalyzer.equals("JSON")) {
            File file = new File(path_file);
            String fileName = file.getName();
            //System.out.println(fileName);
            try {
                AnalyzerResult result = Utils.analyzerFileJSON(content, fileName);
                this.ast = result.ast;
                this.lexErrorsJSON = result.lexErrors;
                this.tokensJSON = result.tokens;
                this.sintaxErrorsJSON = result.sintaxErrors;

                for (Variable variable : result.variables_json) {
                    if (variable != null) {
                        variables_json.add(variable);
                    }
                }

                if (!lexErrorsJSON.isEmpty() || !sintaxErrorsJSON.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Se han encontrado errores en la entrada", "Error", JOptionPane.WARNING_MESSAGE);

                    ErrorsReport lexicalErrorsReport = new ErrorsReport();
                    String content_html_errors = lexicalErrorsReport.generateErrorsReport(lexErrorsJSON);

                    try {
                        FileWriter writer = new FileWriter("./src/main/java/reports/erroresJSON.html");
                        writer.write(content_html_errors);
                        writer.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "¡Error al crear el archivo de reporte!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    TokensReport all_tokens = new TokensReport();
                    String content_html_tokens = all_tokens.generateTokenReport(tokensJSON);

                    try {
                        FileWriter writer = new FileWriter("./src/main/java/reports/tokensJSON.html");
                        writer.write(content_html_tokens);
                        writer.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "¡Error al crear el archivo de reporte!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "No se ha ejecutado el archivo", "Error", JOptionPane.WARNING_MESSAGE);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnRunMousePressed

    private void btnRunMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseReleased

    }//GEN-LAST:event_btnRunMouseReleased

    private void areaCodeCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_areaCodeCaretPositionChanged

    }//GEN-LAST:event_areaCodeCaretPositionChanged

    private void areaCodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_areaCodeCaretUpdate
        try {
            int caretpos = this.areaCode.getCaretPosition();
            line = this.areaCode.getLineOfOffset(caretpos);
            column = caretpos - this.areaCode.getLineStartOffset(line);
            line += 1;
            column += 1;
            this.position.setText("Ln " + String.valueOf(line) + ", Col " + String.valueOf(column));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_areaCodeCaretUpdate

    private void btnReportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMousePressed

    }//GEN-LAST:event_btnReportMousePressed

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        this.btnReport.setSelected(false);
    }//GEN-LAST:event_btnReportMouseExited

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed

    }//GEN-LAST:event_positionActionPerformed

    private void btnStatPyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatPyActionPerformed
        this.currentAnalyzer = "StatPy";
        this.lblCurrentAnalyzer.setText(this.currentAnalyzer);
    }//GEN-LAST:event_btnStatPyActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        this.currentAnalyzer = "JSON";
        this.lblCurrentAnalyzer.setText(this.currentAnalyzer);
    }//GEN-LAST:event_btnJsonActionPerformed

    private void btnTokensReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTokensReportActionPerformed
        try {
            File fileHTML = new File("src/main/java/reports/tokensStatPy.html");

            if (fileHTML.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(fileHTML.toURI());
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File fileHTML = new File("src/main/java/reports/tokensJSON.html");

            if (fileHTML.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(fileHTML.toURI());
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTokensReportActionPerformed

    private void btnErrorsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorsReportActionPerformed
        try {
            File fileHTML = new File("src/main/java/reports/erroresStatPy.html");

            if (fileHTML.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(fileHTML.toURI());
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File fileHTML = new File("src/main/java/reports/erroresJSON.html");

            if (fileHTML.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(fileHTML.toURI());
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnErrorsReportActionPerformed

    private void btnUserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManualActionPerformed
        try {
            File filePDF = new File("src/main/java/docs/[OLC1]P12S2023.pdf");

            if (filePDF.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.OPEN)) {
                    desktop.open(filePDF);
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUserManualActionPerformed

    private void btnTechManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechManualActionPerformed
        try {
            File filePDF = new File("src/main/java/docs/[OLC1]P12S2023.pdf");

            if (filePDF.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.OPEN)) {
                    desktop.open(filePDF);
                } else {
                    JOptionPane.showMessageDialog(this, "La funcionalidad de navegación no es compatible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Error el archivo no existe!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTechManualActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCode;
    private javax.swing.JTextArea areaResult;
    private javax.swing.JMenuItem btnErrorsReport;
    private javax.swing.JMenu btnHelp;
    private javax.swing.JMenuItem btnJson;
    private javax.swing.JMenuItem btnOpen;
    private javax.swing.JMenu btnReport;
    private javax.swing.JMenu btnRun;
    private javax.swing.JMenuItem btnSave;
    private javax.swing.JMenuItem btnSaveAs;
    private javax.swing.JMenuItem btnStatPy;
    private javax.swing.JMenuItem btnTechManual;
    private javax.swing.JMenuItem btnTokensReport;
    private javax.swing.JMenuItem btnUserManual;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCurrentAnalyzer;
    private javax.swing.JMenu menuAnalyzer;
    private javax.swing.JMenu menuFile;
    private javax.swing.JTextField position;
    // End of variables declaration//GEN-END:variables
}
