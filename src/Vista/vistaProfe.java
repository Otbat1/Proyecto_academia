package Vista;

public class vistaProfe extends javax.swing.JFrame{
    public vistaProfe() {
        initComponents();
                this.setExtendedState(vistaProfe.MAXIMIZED_BOTH);
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtEdadd = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtIdAcademia = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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
                "ID", "NOMBRES", "APELLIDO", "ID ACADEMIA", "EDAD", "SUELDO", "GRADO", "CARGO"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setRowMargin(4);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(50);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(0).setMaxWidth(3050);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(10, 20, 754, 103);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(0, 0, 470, 140);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(470, 0, 300, 140);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 440, 770, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));
        jPanel4.setLayout(null);

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtNom);
        txtNom.setBounds(104, 61, 217, 22);

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtApellido);
        txtApellido.setBounds(104, 89, 217, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel1.setText("ID:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 30, 84, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel2.setText("NOMBRES:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 60, 84, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel3.setText("APELLIDO:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 90, 84, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel6.setText("EDAD");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 150, 84, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel7.setText("GRADO");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 210, 84, 22);

        jLabel8.setBackground(new java.awt.Color(204, 0, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 3, 12)); // NOI18N
        jLabel8.setText("ID ACADEMIA");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(16, 123, 84, 16);

        txtGrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradoActionPerformed(evt);
            }
        });
        jPanel4.add(txtGrado);
        txtGrado.setBounds(104, 205, 217, 22);

        txtSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtSueldo);
        txtSueldo.setBounds(104, 177, 217, 22);

        txtEdadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtEdadd);
        txtEdadd.setBounds(104, 147, 217, 22);

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

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(0, 0, 170, 240);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(480, 60, 170, 240);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel4.add(btnEditar);
        btnEditar.setBounds(237, 310, 110, 30);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        jPanel4.add(btnNuevo);
        btnNuevo.setBounds(350, 310, 110, 30);

        txtIdAcademia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtIdAcademia);
        txtIdAcademia.setBounds(104, 117, 217, 22);

        btnRegresar.setText("ATRAS");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar);
        btnRegresar.setBounds(0, 333, 80, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel9.setText("SUELDO");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 180, 84, 22);

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtId);
        txtId.setBounds(104, 27, 217, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 3, 16)); // NOI18N
        jLabel10.setText("CARGO");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 240, 84, 22);

        txtCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        jPanel4.add(txtCargo);
        txtCargo.setBounds(104, 233, 217, 22);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(450, 0, 250, 370);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/th (1).jpg"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 450, 370);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(16, 26, 710, 370);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, -20, 460, 450);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(460, 0, 250, 390);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 10, 710, 390);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 474, 430);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 0, 350, 410);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 410, 470, 200);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xd.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 404, 350, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradoActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

//    public static void main(String args[]) {
//       vistaProfe v=new vistaProfe();
//       Controlador con=new Controlador(v);
//       v.setVisible(true);
//       v.setLocationRelativeTo(null);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnListar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegresar;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtEdadd;
    public javax.swing.JTextField txtGrado;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtIdAcademia;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
