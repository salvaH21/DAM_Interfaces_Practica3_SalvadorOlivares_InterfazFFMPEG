package interfazffmpeg;

public class InterfazFFMPEG extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    // End of variables declaration   

    public InterfazFFMPEG() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("CONVERSOR FFMPEG");

        jLabel2.setText("Nombre del archivo de entrada");

        jTextField2.setText("jTextField2");

        jLabel3.setText("Nombre del archivo nuevo");

        jTextField3.setText("jTextField3");

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"avi", "mp4", "mkv", "mp3 (solo audio)"}));

        jLabel4.setText("Especifica el formato nuevo");

        jLabel5.setText("Indica formato original");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"mp4", "avi", "mkv"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 373, Short.MAX_VALUE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(jButton2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String programa = "C://Users//salva//Documents//FFMPEG//ffmpegejecutable//bin//ffmpeg.exe";
        String entrada = "C://Codificar//" + jTextField2.getText() + "." + jComboBox2.getSelectedItem().toString();
        String salida = "C://Codificar//" + jTextField3.getText() + "." + jComboBox1.getSelectedItem().toString();
        String formatoSalida = jComboBox1.getSelectedItem().toString();
        String comando = programa + " -i " + entrada + " " + salida;
        try {
            if (formatoSalida.equalsIgnoreCase("mp3 (solo audio)")) {
                comando = programa + " -i " + entrada + " " + "-vn" + " C://Codificar//" + jTextField3.getText() + ".mp3";
                ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", comando);
                Process miproceso = proceso.start();
            } /*else if () {
                
            }*/ else {
                ProcessBuilder proceso = new ProcessBuilder("cmd.exe", "/c", comando);
                Process miproceso = proceso.start();
            }
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFFMPEG().setVisible(true);
            }
        });

    }

}
