
package djm_lab6;

public class JF extends javax.swing.JFrame {


    public JF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jFrame5 = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icn.png")));
        jFrame2.setMinimumSize(new java.awt.Dimension(747, 480));
        jFrame2.setPreferredSize(new java.awt.Dimension(747, 480));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jButton3.setText("НАЗАД");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton3);
        jButton3.setBounds(40, 380, 170, 42);

        jButton4.setText("ДАЛЕЕ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton4);
        jButton4.setBounds(520, 380, 160, 42);

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jCheckBox1.setText("КРАСНЫЙ");
        jCheckBox1.setActionCommand("0");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(30, 120, 210, 40);

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jCheckBox2.setText("ФИОЛЕТОВЫЙ");
        jCheckBox2.setActionCommand("1");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(30, 160, 200, 50);

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jCheckBox3.setText("СИНИЙ");
        jCheckBox3.setActionCommand("2");
        jFrame2.getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(30, 210, 190, 40);

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jCheckBox4.setText("ЧЁРНЫЙ");
        jCheckBox4.setActionCommand("3");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(30, 260, 180, 40);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("КАКОЙ ИЗ НИХ ВАШ ЛЮБИМЫЙ ЦВЕТ?");
        jFrame2.getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 690, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Persephone\\Documents\\NetBeansProjects\\DJM_Lab6\\uwu.gif")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jFrame2.getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 110, 460, 250);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icn.png")));
        jFrame3.setMinimumSize(new java.awt.Dimension(747, 480));
        jFrame3.setPreferredSize(new java.awt.Dimension(747, 480));
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosed(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton5.setText("НАЗАД");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton5);
        jButton5.setBounds(50, 380, 170, 42);

        jButton6.setText("ДАЛЕЕ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton6);
        jButton6.setBounds(530, 380, 170, 42);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("ЛЮБИМОЕ ВРЕМЯ ГОДА:");
        jFrame3.getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 30, 580, 42);

        jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ЗИМА"},
                {"ВЕСНА"},
                {"ЛЕТО"},
                {"ОСЕНЬ"}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable2.setRowHeight(36);
        jTable2.setTableHeader(null);
        jScrollPane2.setViewportView(jTable2);

        jFrame3.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 130, 190, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Persephone\\Documents\\NetBeansProjects\\DJM_Lab6\\q.gif")); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jFrame3.getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 90, 460, 270);

        jFrame3.setLocationRelativeTo(null);

        jFrame4.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icn.png")));
        jFrame4.setMinimumSize(new java.awt.Dimension(747, 480));
        jFrame4.setPreferredSize(new java.awt.Dimension(747, 480));
        jFrame4.setResizable(false);
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosed(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jButton7.setText("НАЗАД");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton7);
        jButton7.setBounds(80, 380, 170, 42);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel7.setText("СКОЛЬКО ВАМ ЛЕТ?");
        jFrame4.getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 20, 380, 70);

        jList1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "15+", "20+", "25+", "30+" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jFrame4.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 110, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Persephone\\Documents\\NetBeansProjects\\DJM_Lab6\\E.gif")); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jFrame4.getContentPane().add(jPanel4);
        jPanel4.setBounds(180, 100, 500, 250);

        jButton8.setText("ДАЛЕЕ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton8);
        jButton8.setBounds(520, 380, 170, 42);

        jFrame4.setLocationRelativeTo(null);

        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icn.png")));
        jFrame5.setMinimumSize(new java.awt.Dimension(747, 480));
        jFrame5.setPreferredSize(new java.awt.Dimension(747, 480));
        jFrame5.setResizable(false);
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosed(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jButton9.setText("НАЗАД");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(40, 380, 170, 42);

        jButton10.setText("ВЫЙТИ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(510, 380, 160, 42);

        jTable3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ВОПРОСЫ", "ОТВЕТЫ"
            }
        ));
        jTable3.setRowHeight(30);
        jTable3.setUpdateSelectionOnSort(false);
        jScrollPane3.setViewportView(jTable3);

        jFrame5.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 120, 640, 120);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel8.setText("ИТОГИ ТЕСТА:");
        jFrame5.getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 30, 270, 60);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icn.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME, DARLING!");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 410, 42);

        jButton1.setText("ВЫЙТИ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 420, 170, 42);

        jButton2.setText("НАЧАТЬ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(541, 420, 160, 42);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Persephone\\Documents\\NetBeansProjects\\DJM_Lab6\\PEW.gif")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(39, 78, 660, 330);

        setSize(new java.awt.Dimension(763, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jFrame2.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame3.setVisible(false);
        jFrame4.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame3.setVisible(true);
        jFrame4.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jFrame2.setVisible(true);
        jFrame3.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame4.setVisible(false);
        jFrame5.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame4.setVisible(true);
        jFrame5.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame3WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosed
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosed

    private void jFrame4WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosed
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosed

    private void jFrame5WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosed
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
        jTable3.setValueAt("Ваш любимый цвет:", 0, 0);
        switch (buttonGroup1.getSelection().getActionCommand()) {
            case "0":
                jTable3.setValueAt("КРАСНЫЙ", 0, 1);
                break;
            case "1":
                jTable3.setValueAt("ФИОЛЕТОВЫЙ", 0, 1);
                break;
            case "2":
                jTable3.setValueAt("СИНИЙ", 0, 1);
                break;
            case "3":
                jTable3.setValueAt("ЧЁРНЫЙ", 0, 1);
                break;
        }

        jTable3.setValueAt("Время года:", 1, 0);
        switch (jTable2.getSelectedRow()) {
            case 0:
                jTable3.setValueAt("ЗИМА", 1, 1);
                break;
            case 1:
                jTable3.setValueAt("ВЕСНА", 1, 1);
                break;
            case 2:
                jTable3.setValueAt("ЛЕТО", 1, 1);
                break;
            case 3:
                jTable3.setValueAt("ОСЕНЬ", 1, 1);
                break;
            default:
                jTable3.setValueAt("Нет любимого", 1, 1);
        }
        
            jTable3.setValueAt("Ваш возраст:", 2, 0);
        switch (jList1.getAnchorSelectionIndex()) {
            case 0:
                jTable3.setValueAt("15+", 2, 1);
                break;
            case 1:
                jTable3.setValueAt("20+", 2, 1);
                break;
            case 2:
                jTable3.setValueAt("25+", 2, 1);
                break;
            case 3:
                jTable3.setValueAt("30+", 2, 1);
                break;
        }
    }//GEN-LAST:event_jFrame5WindowActivated

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
            java.util.logging.Logger.getLogger(JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
