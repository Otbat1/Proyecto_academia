package Vista;

public class vista extends javax.swing.JFrame{
    public vista() {
        initComponents();
        this.setExtendedState(vista.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        txtMensualidad = new javax.swing.JTextField();
        txtEdadd = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtIdAcademia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jFechaIN = new com.toedter.calendar.JDateChooser();
        jFechaNA = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaAcademia = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD - JAVA - PATRON DE DISEÑO MVC");
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));
        jPanel2.setLayout(null);

        tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "APELLIDO", "FECHA NA", "EDAD", "FECHA IN", "GRADO", "MENSUALIDAD", "ID ACADEMIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setRowMargin(4);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(50);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(0).setMaxWidth(3050);
        }

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(16, 27, 757, 179);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 0, 470, 220);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(460, 0, 330, 220);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 412, 790, 220);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));
        jPanel4.setLayout(null);

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtNom);
        txtNom.setBounds(91, 61, 215, 22);

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtApellido);
        txtApellido.setBounds(91, 89, 215, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel1.setText("ID:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 30, 71, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jLabel2.setText("NOMBRES:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(16, 61, 74, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jLabel3.setText("APELLIDO:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(16, 89, 80, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jLabel4.setText("FECHA NA:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(16, 117, 80, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jLabel5.setText("FECHA IN:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 170, 71, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel6.setText("EDAD");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 140, 71, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel7.setText("GRADO");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 190, 71, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        jLabel8.setText("ID ACADEMIA");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 270, 120, 20);

        txtGrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradoActionPerformed(evt);
            }
        });
        jPanel4.add(txtGrado);
        txtGrado.setBounds(91, 191, 215, 22);

        txtMensualidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtMensualidad);
        txtMensualidad.setBounds(110, 230, 215, 22);

        txtEdadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtEdadd);
        txtEdadd.setBounds(91, 141, 215, 22);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel6.setLayout(null);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/add.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        jPanel6.add(btnAgregar);
        btnAgregar.setBounds(16, 27, 145, 33);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/list.png"))); // NOI18N
        btnListar.setText("LISTAR");
        jPanel6.add(btnListar);
        btnListar.setBounds(16, 78, 145, 33);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        jPanel6.add(btnDelete);
        btnDelete.setBounds(16, 189, 145, 33);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/update.png"))); // NOI18N
        btnActualizar.setText("UPDATE");
        jPanel6.add(btnActualizar);
        btnActualizar.setBounds(16, 138, 145, 33);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(0, 0, 180, 250);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(490, 40, 180, 250);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel4.add(btnEditar);
        btnEditar.setBounds(370, 250, 97, 28);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        jPanel4.add(btnNuevo);
        btnNuevo.setBounds(370, 290, 95, 28);

        btnRegresar.setText("ATRAS");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar);
        btnRegresar.setBounds(0, 0, 90, 30);

        txtIdAcademia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtIdAcademia);
        txtIdAcademia.setBounds(120, 270, 215, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 3, 12)); // NOI18N
        jLabel9.setText("MENSUALIDAD");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 230, 88, 16);

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtId);
        txtId.setBounds(91, 27, 215, 22);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(470, 0, 260, 340);
        jPanel4.add(jFechaIN);
        jFechaIN.setBounds(100, 170, 81, 20);
        jPanel4.add(jFechaNA);
        jFechaNA.setBounds(100, 120, 81, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(0, 0, 470, 340);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(16, 27, 730, 330);

        TablaAcademia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"5"}
            },
            new String [] {
                "Id Academia"
            }
        ));
        jScrollPane6.setViewportView(TablaAcademia);

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(602, 27, 95, 108);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 0, 440, 380);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(440, 0, 310, 380);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 20, 750, 380);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 470, 420);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 0, 350, 420);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-10, 410, 470, 230);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 400, 300, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

//    public static void main(String args[]) {
//       vista v=new vista();
//       Controlador con=new Controlador(v);
//       v.setVisible(true);
//       v.setLocationRelativeTo(null);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAcademia;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegresar;
    public com.toedter.calendar.JDateChooser jFechaIN;
    public com.toedter.calendar.JDateChooser jFechaNA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtEdadd;
    public javax.swing.JTextField txtGrado;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtIdAcademia;
    public javax.swing.JTextField txtMensualidad;
    public javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
