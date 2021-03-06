
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;


public class MainFrame extends javax.swing.JFrame implements ActionListener {
    
    private String operand, operator;
    
    public MainFrame() {
        initComponents();
        
        this.setTitle("계산기");
        txtResult.setEditable(false);
        txtResult.setHorizontalAlignment(JTextField.RIGHT);
        
        btnMC.setForeground(Color.red);
        btnMR.setForeground(Color.red);
        btnMS.setForeground(Color.red);
        btnMplus.setForeground(Color.red);
        btnBackspace.setForeground(Color.red);
        btnCE.setForeground(Color.red);
        btnC.setForeground(Color.red);
        btnMultiply.setForeground(Color.red);
        btnMinus.setForeground(Color.red);
        btnPlus.setForeground(Color.red);        
        btnDivision.setForeground(Color.red);
        btnResult.setForeground(Color.red);
       
        btn0.setForeground(Color.blue);
        btn1.setForeground(Color.blue);
        btn2.setForeground(Color.blue);
        btn3.setForeground(Color.blue);
        btn4.setForeground(Color.blue);
        btn5.setForeground(Color.blue);
        btn6.setForeground(Color.blue);
        btn7.setForeground(Color.blue);
        btn8.setForeground(Color.blue);
        btn9.setForeground(Color.blue);
        btnRemainder.setForeground(Color.blue);
        btnPM.setForeground(Color.blue);
        btnSprt.setForeground(Color.blue);
        btnFraction.setForeground(Color.blue);
        
        btnMC.addActionListener(this);
        btnMR.addActionListener(this);
        btnMS.addActionListener(this);
        btnMplus.addActionListener(this);
        btnBackspace.addActionListener(this);
        btnCE.addActionListener(this);
        btnC.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);        
        btnDivision.addActionListener(this);
        btnResult.addActionListener(this);
       
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnRemainder.addActionListener(this);
        btnPM.addActionListener(this);
        btnSprt.addActionListener(this);
        btnFraction.addActionListener(this);
        memoryState.addActionListener(this);
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackspace = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMplus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnRemainder = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnSprt = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        memoryState = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBackspace.setText("Backspace");

        btnCE.setText("CE");

        btnC.setText("C");

        btnMC.setText("MC");

        btnMR.setText("MR");

        btnMS.setText("MS");

        btnMplus.setText("M+");

        btn4.setText("4");

        btn7.setText("7");

        btn1.setText("1");

        btn0.setText("0");

        btnPM.setText("+/-");

        btnPoint.setText(".");

        btnResult.setText("=");

        btnPlus.setText("+");

        btn2.setText("2");

        btn3.setText("3");

        btnFraction.setText("1/x");

        btnMinus.setText("-");

        btnRemainder.setText("%");

        btn5.setText("5");

        btn6.setText("6");

        btnMultiply.setText("*");

        btnDivision.setText("/");

        btn9.setText("9");

        btn8.setText("8");

        btnSprt.setText("sqrt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPoint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResult)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(memoryState)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSprt)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemainder))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFraction))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtResult)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDivision, btnFraction, btnMinus, btnMultiply, btnPM, btnPlus, btnPoint, btnRemainder, btnResult, btnSprt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBackspace)
                        .addComponent(btnCE)
                        .addComponent(btnC))
                    .addComponent(memoryState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMC)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnSprt)
                    .addComponent(btnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMR)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnRemainder)
                    .addComponent(btnMultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMS)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnFraction)
                    .addComponent(btnMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMplus)
                    .addComponent(btn0)
                    .addComponent(btnPM)
                    .addComponent(btnPoint)
                    .addComponent(btnResult)
                    .addComponent(btnPlus))
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
                new MainFrame().setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMplus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPM;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnRemainder;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSprt;
    private javax.swing.JTextField memoryState;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();    // 이벤트를 발생시킨 객체를 문자열 객체 s에 저장
        String input = txtResult.getText();    // 이벤트 발생 당시의 텍스트 필드 내용을 문자열 result에 저장
        double result = 0;
        double memory = 0;
        
        if(s == "0" || s == "1" || s == "2" || s == "3" || s == "4" || s == "5" || s == "6" || s == "7" || s == "8" || s == "9" || s == "." ){
            txtResult.setText(input + s);  // 숫자나 dot이면 문자열 뒤에 붙인다.
        }
        if(s == "+" || s == "-" || s == "*" || s == "/"){   // 사칙연산이면 현재의 텍스트필드 값과 연산자를 operand와 operator 객체에 저장
         operand = input;  
         operator = s;
         txtResult.setText("");
        }
        if(s == "C"){   // "C"이면 텍스트 필드의 내용을 지운다.
            txtResult.setText("");
        }
        if(s == "CE"){  // "CE"일 경우 기존의 입력받은 피연산자를 초기화
            txtResult.setText("");
            input = null;
        }
        if(s == "Backspace"){   // Backspace면 문자열의 마지막 글자를 제외하고 다시 나타낸다.
            String temp = txtResult.getText();
            temp = temp.substring(0, temp.length()-1);
            txtResult.setText(temp);
        }
        if(s == "%"){   // 두 수의 곱을 100으로 나눈 값(퍼센트)를 구하여 나타낸다.
            result = Double.parseDouble(operand) * Double.parseDouble(input) / 100;
            txtResult.setText(""+result);
        }
        if(s == "sqrt"){    // 루트 값을 나타낸다.
            result = Math.sqrt(Double.parseDouble(input));
            txtResult.setText(""+result);
        }
        if(s == "1/x"){     // 분수 값을 나타낸다.
            result = 1 / (Double.parseDouble(input));
            txtResult.setText(""+result);
        }
        if(s == "+/-"){     // 역수값을 나타낸다.
            result = -1 * (Double.parseDouble(input));
            txtResult.setText(""+result); 
        }
        if(s == "MS"){  // 메모리에 결과 값을 저장
            memory = Double.parseDouble(txtResult.getText());
            memoryState.setText("M");
        }
        if(s == "MR"){  // 메모리에 저장되어 있는 결과 값을 읽어옴
            txtResult.setText(""+memory);
            memoryState.setText("M");
        }
        if(s == "MC"){  // 메모리에 저장되어 있는 결과값을 초기화
            memory = 0;
            memoryState.setText("");
        }   
        if(s == "M+"){  // 메모리에 저장되어 있는 부호를 +로 바꿈
            memory += result;
            memoryState.setText("M");
        }
        if(s == "="){       // "="일 경우 해당하는 연산자를 구분하여 해당 연산결과를 나타낸다.
            char c = operator.charAt(0);
            switch(c){
                case '+' :
                result = Double.parseDouble(operand) + Double.parseDouble(input);
                txtResult.setText(""+result);
                break;
                
                case '-' :
                result = Double.parseDouble(operand) - Double.parseDouble(input);
                txtResult.setText(""+result);
                break;
        
                case '*' :
                result = Double.parseDouble(operand) * Double.parseDouble(input);
                txtResult.setText(""+result);
                break;
        
                case '/' :
                result = Double.parseDouble(operand) / Double.parseDouble(input);
                txtResult.setText(""+result);
                break;
            }
        }
    }
}
