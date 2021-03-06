/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfuzzylogic;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ammar ALwaeli
 */
public class Encryption extends javax.swing.JFrame {

    /**
     * Creates new form Encryption
     */
    Scanner in;
    String a[];
    char ch;
    int c;
    boolean flag1, flag2, flag3, flag4;
    ArrayList<String> lines;
    ArrayList<Integer> asci;
    ArrayList<Long> binary;
    ArrayList<String> binary1;
    ArrayList<Character> letters;
    String state;

    public Encryption() {
        initComponents();
        this.setSize(850, 670);
        this.setMinimumSize(new Dimension(850, 0));
        this.setMaximumSize(new Dimension(850, Integer.MAX_VALUE));
        lines = new ArrayList<>();
        asci = new ArrayList<>();
        binary = new ArrayList<>();
        binary1 = new ArrayList<>();
        letters = new ArrayList<>();
        flag1 = false;
        flag2 = true;
        flag4 = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Plain = new javax.swing.JTextArea();
        Input = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        Encryption = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Encryption1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Convert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OPen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(830, 650));
        getContentPane().setLayout(null);

        Plain.setColumns(20);
        Plain.setRows(5);
        Plain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlainMouseClicked(evt);
            }
        });
        Plain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlainKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PlainKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(Plain);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 80, 310, 380);

        Input.setText("Input text to Encrypt");
        Input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputMouseClicked(evt);
            }
        });
        getContentPane().add(Input);
        Input.setBounds(180, 50, 135, 23);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Number of Letters");
        jLabel4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel4InputMethodTextChanged(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel4KeyTyped(evt);
            }
        });

        Refresh.setText("Refull");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });

        Encryption.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Encryption.setText("Encryption");
        Encryption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncryptionMouseClicked(evt);
            }
        });

        Encryption1.setText("Home");
        Encryption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Encryption1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Encryption1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Encryption1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 470, 410, 160);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("table of letters"));
        jPanel1.setOpaque(false);

        Convert.setText("Convert");
        Convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConvertMouseClicked(evt);
            }
        });
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letters", "ASCII Code", "Binary Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Convert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 30, 434, 430);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose one of these options");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 140, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Or");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 40, 40, 40);

        OPen.setText("Open file to convert");
        OPen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OPenMouseClicked(evt);
            }
        });
        getContentPane().add(OPen);
        OPen.setBounds(10, 50, 129, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EncBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 850, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlainMouseClicked

        if (!Plain.getText().equals("")) {
            if (JOptionPane.showConfirmDialog(this, "Do you want to clear this message", "Confirm", JOptionPane.OK_CANCEL_OPTION) == 0) {
                Plain.setText("");
                Plain.setEditable(true);
                jLabel4.setText("Number of Letters : ");
                asci.clear();
                binary.clear();
                binary1.clear();
                letters.clear();
            }
        }
    }//GEN-LAST:event_PlainMouseClicked

    private void PlainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlainKeyTyped
        jLabel4.setText("Number of Letters : " + (Plain.getText().length() + 1));
    }//GEN-LAST:event_PlainKeyTyped

    private void InputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputMouseClicked
        Plain.setText("");
        Plain.setEditable(true);
        jLabel4.setText("Number of Letters : ");
    }//GEN-LAST:event_InputMouseClicked

    private void jLabel4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel4InputMethodTextChanged

    }//GEN-LAST:event_jLabel4InputMethodTextChanged

    private void jLabel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyTyped

    }//GEN-LAST:event_jLabel4KeyTyped

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        Plain.setText("");
        jLabel4.setText("Number of Letters : ");
        DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(model);
        DefaultListModel listModel = new DefaultListModel();

        lines = new ArrayList<>();
        asci = new ArrayList<>();
        binary = new ArrayList<>();
        binary1 = new ArrayList<>();
        letters = new ArrayList<>();
        state = "";
    }//GEN-LAST:event_RefreshMouseClicked

    private void EncryptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncryptionMouseClicked
        if (!asci.isEmpty() && !letters.isEmpty() && !binary1.isEmpty()) {
            flag4 = true;
            state = "E";
            EncryptionFrame x = new EncryptionFrame();
            x.setLetters(letters);
            x.setEncryption(this);
            x.setASCII(asci);
            x.setBinary(binary1);
            x.setVisible(true);
            x.setResizable(false);
        }
    }//GEN-LAST:event_EncryptionMouseClicked

    private void ConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertMouseClicked
        if (!Plain.getText().equals("")) {
            letters.clear();
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("Letters");
            model.addColumn("ASCII Code");
            model.addColumn("Binary Code");
            getBinary(Plain.getText());
            for (int i = 0; i < Plain.getText().length(); i++) {
                asci.add((int) (Plain.getText().charAt(i)));
                model.addRow(new Object[]{Plain.getText().charAt(i), asci.get(i), binary1.get(i)});
                letters.add(Plain.getText().charAt(i));
            }
        }
    }//GEN-LAST:event_ConvertMouseClicked

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed

    }//GEN-LAST:event_ConvertActionPerformed

    private void OPenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPenMouseClicked
        lines.clear();
        binary.clear();
        asci.clear();
        letters.clear();
        try {
            Plain.setText("");
            loadFile();
            flag1 = true;
            flag2 = false;

            jLabel4.setText("Number of Letters : " + Plain.getText().length());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_OPenMouseClicked

    private void Encryption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Encryption1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_Encryption1MouseClicked

    private void PlainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlainKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlainKeyPressed

    public void loadFile() throws IOException {
        flag2 = true;
        flag3 = true;
        String line;
        int i = 0;
        try {
            JFileChooser loadEmp = new JFileChooser();
            File selectedFile;
            if (loadEmp.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                selectedFile = loadEmp.getSelectedFile();
                if (selectedFile.canRead() && selectedFile.exists()) {
                    File f = new File(selectedFile.getAbsolutePath());
                    String s = "";
                    Scanner in = new Scanner(f);
                    while (in.hasNext()) {
                        s += in.nextLine();
                    }
                    //byte[] bytes = readSmallBinaryFile(selectedFile.getAbsolutePath());
                    for (char b:s.toCharArray()) {
                        asci.add((int) b);
                        //System.out.println(b);
                        Plain.setText(Plain.getText() + (char) (asci.get(i).intValue()));
                        i++;
                    }
                }
                Plain.setEditable(false);
            } else {
                Plain.setEditable(true);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    byte[] readSmallBinaryFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        File f = new File(aFileName);
        String s = "";
        Scanner in = new Scanner(f);
        while (in.hasNext()) {
            s += in.nextLine();
        }
        //System.out.println((int) s.charAt(0));
        return s.getBytes(StandardCharsets.UTF_8);

    }

    public void getASCIICode(String line) {
        //int array[] = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            ch = (line.charAt(i));
            c = (int) ch;
            asci.add(c);
        }
    }

    public void getBinary(String line) {
        a = new String[line.length()];
        String n = "";
        for (int i = 0; i < line.length(); i++) {
            ch = (line.charAt(i));
            c = (int) ch;
            a[i] = Integer.toBinaryString(c);//String
            if (a[i].length() < 12) {
                for (int j = 0; j < 12 - a[i].length(); j++) {
                    n += "0";
                }
                n += a[i];
                //System.out.print(n+"\n");
            }
            binary1.add(n);
            n = "";
            binary.add(Long.valueOf(a[i]));
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Encryption().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton Encryption;
    private javax.swing.JButton Encryption1;
    private javax.swing.JButton Input;
    private javax.swing.JButton OPen;
    private javax.swing.JTextArea Plain;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
