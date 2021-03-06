import java.awt.event.*;
import java.awt.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yeonguk
 */
public class MainFrame extends javax.swing.JFrame {

   int iMenu_idx = 0;                   // Menu Index
   int ix, iy, width, height;
   Color cData = new Color(255, 255, 255);  // Color 초기화(Blue)
  
   Font objFont;                        // Font Class의 객체 선언
   String strData = null;               // 출력 문자열 저장 변수
   
    public MainFrame() {
        initComponents();
        
        jPopupMenu1.add(mnuFile_Open);
        jPopupMenu1.add(mnuFile_Save);
        jPopupMenu1.addSeparator();
        jPopupMenu1.add(mnuFile_Exit);
    }

    public void paint(Graphics g){
        //g.clearRect(0, 53, this.getWidth(), this.getHeight());
        super.paintComponents(g);
        switch(iMenu_idx){                          
            case 31:
                g.drawLine(ix, iy, 250, 250);   // Line 그리기
                break;
            case 32:
                g.drawOval(ix, iy, width, height);  // 타원 그리기
                g.fillOval(ix, iy, width, height);  // 타원 채우기
                break;
            case 33:
                g.drawRect(ix, iy, width, height);  // 사각형 그리기
                g.fillRect(ix, iy, width, height);  // 사각형 채우기
                break;
            case 41:
                strData = "Arial font";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
            case 42:
                strData = "궁서체 입니다.";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
            case 43:
                strData = "돋움체 입니다.";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFile_Open = new javax.swing.JMenuItem();
        mnuFile_Save = new javax.swing.JMenuItem();
        mnuFile_Exit = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuGraphic = new javax.swing.JMenu();
        mnuGraphic_Line = new javax.swing.JMenuItem();
        mnuGraphic_Ellipse = new javax.swing.JMenuItem();
        mnuGraphic_Rectangle = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuFont_Arial = new javax.swing.JMenuItem();
        mnuFont_Gungseo = new javax.swing.JMenuItem();
        mnuFont_Dotum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        mnuFile.setText("File");

        mnuFile_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Open.setText("열기(Open)");
        mnuFile.add(mnuFile_Open);

        mnuFile_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Save.setText("저장(Save)");
        mnuFile.add(mnuFile_Save);

        mnuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Exit.setText("종료(Exit)");
        mnuFile.add(mnuFile_Exit);

        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Edit");
        jMenuBar1.add(mnuEdit);

        mnuGraphic.setText("Graphic");

        mnuGraphic_Line.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Line.setText("Line");
        mnuGraphic_Line.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                mnuGraphic_LineMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        mnuGraphic_Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_LineActionPerformed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Line);

        mnuGraphic_Ellipse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Ellipse.setText("Ellipse");
        mnuGraphic_Ellipse.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                mnuGraphic_EllipseMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        mnuGraphic_Ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_EllipseActionPerformed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Ellipse);

        mnuGraphic_Rectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Rectangle.setText("Rectangle");
        mnuGraphic_Rectangle.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                mnuGraphic_RectangleMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        mnuGraphic_Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_RectangleActionPerformed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Rectangle);

        jMenuBar1.add(mnuGraphic);

        jMenu1.setText("Font");

        mnuFont_Arial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Arial.setText("Arial");
        mnuFont_Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_ArialActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFont_Arial);

        mnuFont_Gungseo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Gungseo.setText("궁서체");
        mnuFont_Gungseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_GungseoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFont_Gungseo);

        mnuFont_Dotum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Dotum.setText("돋움체");
        mnuFont_Dotum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_DotumActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFont_Dotum);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGraphic_LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_LineActionPerformed
        this.setTitle("Line 메뉴 클릭");
        ix = 150;
        iy = 150;
        iMenu_idx = 31;
        this.repaint();                  
    }//GEN-LAST:event_mnuGraphic_LineActionPerformed

    private void mnuGraphic_LineMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_mnuGraphic_LineMenuKeyPressed
        this.setTitle("Line 메뉴 클릭");
        ix = 150;
        iy = 150;
        iMenu_idx = 31;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_LineMenuKeyPressed

    private void mnuGraphic_EllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_EllipseActionPerformed
        this.setTitle("Ellipse 메뉴 클릭");
        ix = iy = 150;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EllipseActionPerformed

    private void mnuGraphic_EllipseMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_mnuGraphic_EllipseMenuKeyPressed
        this.setTitle("Ellipse 메뉴 클릭");
        ix = iy = 150;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EllipseMenuKeyPressed

    private void mnuGraphic_RectangleMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleMenuKeyPressed
        this.setTitle("Rectangle 메뉴 클릭");
        ix = iy = 150;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleMenuKeyPressed

    private void mnuGraphic_RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleActionPerformed
        this.setTitle("Rectangle 메뉴 클릭");
        ix = iy = 150;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       if(evt.getButton() == 3){    // evt.getButton() = 1 / 2 / 3 (Left/Middle/Right) mouse button
           jPopupMenu1.show(this, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_formMouseClicked

    private void mnuFont_ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_ArialActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("Arial", Font.BOLD, 20);
        iMenu_idx = 41;
        this.repaint();
    }//GEN-LAST:event_mnuFont_ArialActionPerformed

    private void mnuFont_GungseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_GungseoActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("궁서체", Font.BOLD, 20);
        iMenu_idx = 42;
        this.repaint();
    }//GEN-LAST:event_mnuFont_GungseoActionPerformed

    private void mnuFont_DotumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_DotumActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("돋움체", Font.BOLD, 20);
        iMenu_idx = 43;
        this.repaint();
    }//GEN-LAST:event_mnuFont_DotumActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JMenuItem mnuFile_Open;
    private javax.swing.JMenuItem mnuFile_Save;
    private javax.swing.JMenuItem mnuFont_Arial;
    private javax.swing.JMenuItem mnuFont_Dotum;
    private javax.swing.JMenuItem mnuFont_Gungseo;
    private javax.swing.JMenu mnuGraphic;
    private javax.swing.JMenuItem mnuGraphic_Ellipse;
    private javax.swing.JMenuItem mnuGraphic_Line;
    private javax.swing.JMenuItem mnuGraphic_Rectangle;
    // End of variables declaration//GEN-END:variables
}
