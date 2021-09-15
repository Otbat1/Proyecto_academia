package Controlador;


import java.awt.event.ActionListener;
import Modelo.*;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Modelo.AlumnoProveedor;
import Vista.Menu;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author leona
 */
public class ControladorAlumnos implements ActionListener{
    private final  alumnos ModeloAlumnos;
    private final  AlumnoProveedor ModeloProveedor;
    vista vista = new vista();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public ControladorAlumnos(vista v,alumnos alumnos, AlumnoProveedor alumnoproveedor) {
        this.ModeloAlumnos=alumnos;
        this.ModeloProveedor=alumnoproveedor;
        this.vista = v;
        this.vista.btnListar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnDelete.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        
    }

    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<alumnos> lista = ModeloProveedor.listar();
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getFechaNa();
            objeto[4] = lista.get(i).getEdad();
            objeto[5] = lista.get(i).getFechaIngreso();
            objeto[6] = lista.get(i).getGrado();
            objeto[7] = lista.get(i).getMensualidad();
            objeto[8] = lista.get(i).getIdacademia();
            
            modelo.addRow(objeto);
        }


    }
    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    public void iniciar (){
        vista.setTitle("Crear Alumno");
        vista.setLocationRelativeTo(null);
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.btnRegresar){
            
            Menu vistaMenu = new Menu();
            Controlador con = new Controlador(vistaMenu);
            
            con.Iniciar();
            vistaMenu.setVisible(true);
            vista.setVisible(false);

        }
        if (e.getSource() == vista.btnListar) {
            limpiarTabla();
            listar(vista.tabla);
            Limpiar();
        }
        if (e.getSource() == vista.btnAgregar) {
            Agregar();
            listar(vista.tabla);
            Limpiar();
        }
        if (e.getSource() == vista.btnEditar) {
            int fila = vista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debee Seleccionar Una fila..!!");
            } else {
                int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
                String nom = (String) vista.tabla.getValueAt(fila, 1);
                String apellido = (String) vista.tabla.getValueAt(fila, 2);
                String fechaNa = (String) vista.tabla.getValueAt(fila, 3);
                int edad = Integer.parseInt((String) vista.tabla.getValueAt(fila, 4).toString());
                String fechaIN = (String) vista.tabla.getValueAt(fila, 5);
                String grado = (String) vista.tabla.getValueAt(fila, 6);
                int mensualidad = Integer.parseInt((String) vista.tabla.getValueAt(fila, 7).toString());
                int IdAcademia = Integer.parseInt((String) vista.tabla.getValueAt(fila, 8).toString());
                vista.txtId.setText("" + id);
                vista.txtNom.setText(nom);
                vista.txtApellido.setText(apellido);
                vista.jFechaNA.setDateFormatString(fechaNa);
                vista.txtEdadd.setText("" +edad);
                vista.jFechaIN.setDateFormatString(fechaIN);
                vista.txtGrado.setText(grado);
                vista.txtMensualidad.setText(""+mensualidad);
                vista.txtIdAcademia.setText(""+IdAcademia);
            }
        }
        if (e.getSource() == vista.btnActualizar) {
            Actualizar();
            listar(vista.tabla);
            Limpiar();

        }
        if (e.getSource() == vista.btnDelete) {
            Eliminar();
            listar(vista.tabla);
            Limpiar();
        }
        if (e.getSource() == vista.btnNuevo) {
            Limpiar();
        }
        
    }

        void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    public void Limpiar(){
        vista.txtId.setText(null);
        vista.txtNom.setText(null);
        vista.txtApellido.setText(null);
        //VistaAlumnos.jdFechaN.actionPerformed(null);
        vista.jFechaNA.setDate(null);
        //VistaAlumnos.jdFechaI.actionPerformed(null);
        vista.txtEdadd.setText(null);
        vista.jFechaIN.setDate(null);
        vista.txtGrado.setText(null);
        vista.txtMensualidad.setText(null);
        vista.txtIdAcademia.setText(null);
    }
        public void Eliminar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
            ModeloProveedor.Elimina(id);
            System.out.println("El Reusltaod es" + id);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado...!!!");
        }
        limpiarTabla();
    }
        
    public void Agregar() {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        ModeloAlumnos.setid(Integer.parseInt(vista.txtId.getText()));
        ModeloAlumnos.setNombre(vista.txtNom.getText());
        ModeloAlumnos.setApellido(vista.txtApellido.getText());
        ModeloAlumnos.setFechaNa(formatoFecha.format(vista.jFechaNA.getDate()));
        ModeloAlumnos.setEdad(Integer.parseInt(vista.txtEdadd.getText()));
        ModeloAlumnos.setFechaIngreso(formatoFecha.format(vista.jFechaIN.getDate()));
        ModeloAlumnos.setGrado(vista.txtGrado.getText());
        ModeloAlumnos.setMensualidad(Integer.parseInt(vista.txtMensualidad.getText()));
        ModeloAlumnos.setIdacademia(Integer.parseInt(vista.txtIdAcademia.getText()));
        
        int r = ModeloProveedor.agregar(ModeloAlumnos);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario Agregado con Exito.");
        } else {
            JOptionPane.showMessageDialog(vista, "Error");
        }
        limpiarTabla();
    }
    public void Actualizar() {
        if (vista.txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "No se Identifica el Id debe selecionar la opcion Editar");
        } else {
            int id = Integer.parseInt(vista.txtId.getText());
            String nom = vista.txtNom.getText();
            String Apellido = vista.txtApellido.getText();
            String FechaNA = vista.jFechaIN.getDateFormatString();
            int edad = Integer.parseInt(vista.txtEdadd.getText());
            String FechaIN = vista.jFechaIN.getDateFormatString();
            String Grado = vista.txtGrado.getText();
            int Mens = Integer.parseInt(vista.txtMensualidad.getText());
            int IdAca = Integer.parseInt(vista.txtIdAcademia.getText());
            
            ModeloAlumnos.setid(id);
            ModeloAlumnos.setNombre(nom);
            ModeloAlumnos.setApellido(Apellido);
            ModeloAlumnos.setFechaNa(FechaNA);
            ModeloAlumnos.setEdad(edad);
            ModeloAlumnos.setFechaIngreso(FechaIN);
            ModeloAlumnos.setGrado(Grado);
            ModeloAlumnos.setMensualidad(Mens);
            ModeloAlumnos.setIdacademia(IdAca);      
//        
//        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//        ModeloAlumnos.setid(Integer.parseInt(vista.txtId.getText()));
//        ModeloAlumnos.setNombre(vista.txtNom.getText());
//        ModeloAlumnos.setApellido(vista.txtApellido.getText());
//        ModeloAlumnos.setFechaNa(formatoFecha.format(vista.jFechaNa.getDate()));
//        ModeloAlumnos.setEdad(Integer.parseInt(vista.txtEdadd.getText()));
//        ModeloAlumnos.setFechaIngreso(formatoFecha.format(vista.jFechaIN.getDate()));
//        ModeloAlumnos.setGrado(vista.txtGrado.getText());
//        ModeloAlumnos.setMensualidad(Integer.parseInt(vista.txtMensualidad.getText()));
//        ModeloAlumnos.setIdacademia(Integer.parseInt(vista.txtIdAcademia.getText()));
//            
            int r = ModeloProveedor.Actualizar(ModeloAlumnos);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Usuario Actualizado con Exito.");
            } else {
                JOptionPane.showMessageDialog(vista, "Error");
            }
        }
        limpiarTabla();
    }
    
        void nuevo() {
        vista.txtId.setText("");
        vista.txtNom.setText("");
        vista.txtApellido.setText("");
        vista.jFechaNA.setDateFormatString("");
        vista.txtEdadd.setText("");
        vista.jFechaIN.setDateFormatString("");
        vista.txtGrado.setText("");
        vista.txtMensualidad.setText("");
        vista.txtIdAcademia.setText("");
        vista.txtNom.requestFocus();
    }

}