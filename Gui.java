package guia1;


public class Gui extends javax.swing.JFrame {

    public Calculadora calcu2= new Calculadora();
    
            
   
    
    public Gui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        texto1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 0, 0));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("cos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        texto1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        texto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        texto3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("x");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText(" ÷");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("sen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("tan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("√");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setText("x^n");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setText("IVA");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("                      INSTRUCCIONES :\n - Para el uso de la calculadora debes \nseguir los siguientes pasos:\n 1. Para usar la suma, resta, multiplicacion\n y division debes agregar dos numeros y\nseleccionar el signo con el que deseas \noperar, tambien funciona para la potencia.\n 2. Para las funciones trigonometricas \nagregas en angulo la primera casilla y \neliges la funcion, esto aplica tambien \npara la raiz.\n 3. Para el iva en la primera casilla debes\ningresar el valor, en la segunda debes \nagregar el porcentaje de iva.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(texto1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(texto2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addComponent(jButton6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)))
                        .addGap(28, 28, 28))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton7)
                            .addComponent(jButton9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String n1=texto1.getText();
        String n2=texto2.getText();
        calcu2.num1=Float.parseFloat(n1);
        calcu2.num2=Float.parseFloat(n2);
        calcu2.suma();
        
        texto3.setText(String.valueOf(calcu2.result));
         
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double a=Double.parseDouble(texto1.getText());
       texto3.setText(String.valueOf(calcu2.cos(a)));
       
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String n1= texto1.getText();
        String n2= texto2.getText();
        calcu2.num1=Float.parseFloat(n1);
        calcu2.num2=Float.parseFloat(n2);
        calcu2.resta();
        
        texto3.setText(String.valueOf(calcu2.result));
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String n1= texto1.getText(); 
        String n2 =texto2.getText();
        calcu2.num1=Float.parseFloat(n1);
        calcu2.num2=Float.parseFloat(n2);
        calcu2.multi();
        texto3.setText(String.valueOf(calcu2.result));
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String n1=texto1.getText();
        String n2=texto2.getText();
        calcu2.num1=Float.parseFloat(n1);
        calcu2.num2=Float.parseFloat(n2);
        calcu2.divi();
        texto3.setText(String.valueOf(calcu2.result));
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double a=Double.parseDouble(texto1.getText());
       texto3.setText(String.valueOf(calcu2.seno(a)));
               
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double a=Double.parseDouble(texto1.getText());
       texto3.setText(String.valueOf(calcu2.tan(a)));
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       double a=Double.parseDouble(texto1.getText());
       texto3.setText(String.valueOf(calcu2.raizCuadra(a)));
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double a=Double.parseDouble(texto1.getText());
        double b=Double.parseDouble(texto2.getText());
       texto3.setText(String.valueOf(calcu2.poten(a,b)));
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String n1=texto1.getText();
        String n2=texto2.getText();
        calcu2.num1=Float.parseFloat(n1);
        calcu2.num2=Float.parseFloat(n2);
        calcu2.iva();
        texto3.setText(String.valueOf(calcu2.result));
    }                                         

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    // End of variables declaration                   
}
