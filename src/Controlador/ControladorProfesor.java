/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.vistaProfe;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leona
 */
public class ControladorProfesor implements ActionListener{
    private final  profesor ModeloProfesor;
    private final  ProfesorProveedor ModeloProveedor;
    vistaProfe vista = new vistaProfe();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public ControladorProfesor(vistaProfe v,profesor profesor, ProfesorProveedor profesorproveedor) {
        this.ModeloProfesor=profesor;
        this.ModeloProveedor=profesorproveedor;
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
        List<profesor> lista = ModeloProveedor.listar();
        Object[] objeto = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getIdacademia();
            objeto[4] = lista.get(i).getEdad();
            objeto[5] = lista.get(i).getSueldo();
            objeto[6] = lista.get(i).getGrado();
            objeto[7] = lista.get(i).getcargo();
            
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
        vista.setTitle("Crear Profesores");
        vista.setLocationRelativeTo(null);
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

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
                int IdAcademia = Integer.parseInt((String) vista.tabla.getValueAt(fila, 3).toString());
                int edad = Integer.parseInt((String) vista.tabla.getValueAt(fila, 4).toString());
                int sueldo = Integer.parseInt((String) vista.tabla.getValueAt(fila, 5).toString());
                String grado = (String) vista.tabla.getValueAt(fila, 6);
                String cargo = (String)vista.tabla.getValueAt(fila, 7);
                vista.txtId.setText("" + id);
                vista.txtNom.setText(nom);
                vista.txtApellido.setText(apellido);
                vista.txtIdAcademia.setText(""+IdAcademia);
                vista.txtEdadd.setText("" +edad);
                vista.txtSueldo.setText(""+sueldo);
                vista.txtGrado.setText(grado);
                vista.txtCargo.setText(cargo);
                
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
        else if(e.getSource() == vista.btnRegresar){
            
            Menu vistaMenu = new Menu();
            Controlador con = new Controlador(vistaMenu);
            
            con.Iniciar();
            vistaMenu.setVisible(true);
            vista.setVisible(false);
        
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
        vista.txtSueldo.setText(null);
        vista.txtEdadd.setText(null);
        vista.txtCargo.setText(null);
        vista.txtGrado.setText(null);
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
        
        ModeloProfesor.setId(Integer.parseInt(vista.txtId.getText()));
        ModeloProfesor.setNombre(vista.txtNom.getText());
        ModeloProfesor.setApellido(vista.txtApellido.getText());
        ModeloProfesor.setIdacademia(Integer.parseInt(vista.txtIdAcademia.getText()));
        ModeloProfesor.setEdad(Integer.parseInt(vista.txtEdadd.getText()));
        ModeloProfesor.setSueldo(Integer.parseInt(vista.txtSueldo.getText()));
        ModeloProfesor.setGrado(vista.txtGrado.getText());
        ModeloProfesor.setcargo(vista.txtGrado.getText());
        
        int r = ModeloProveedor.agregar(ModeloProfesor);
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
            int IdAca = Integer.parseInt(vista.txtIdAcademia.getText());
            String Apellido = vista.txtApellido.getText();
            int edad = Integer.parseInt(vista.txtEdadd.getText());
            int sueldo = Integer.parseInt(vista.txtSueldo.getText());
            String Grado = vista.txtGrado.getText();
            String cargo = vista.txtCargo.getText();
            ModeloProfesor.setId(id);
            ModeloProfesor.setNombre(nom);
            ModeloProfesor.setApellido(Apellido);
            ModeloProfesor.setIdacademia(IdAca);      
            ModeloProfesor.setEdad(edad);
            ModeloProfesor.setSueldo(sueldo);
            ModeloProfesor.setGrado(Grado);
            ModeloProfesor.setcargo(cargo);
//        
//        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//        ModeloProfesor.setId(Integer.parseInt(vista.txtId.getText()));
//        ModeloProfesor.setNombre(vista.txtNom.getText());
//        ModeloProfesor.setApellido(vista.txtApellido.getText());
//        ModeloProfesor.setIdacademia(Integer.parseInt(vista.txtIdAcademia.getText()));
//        ModeloProfesor.setEdad(Integer.parseInt(vista.txtEdadd.getText()));
//        ModeloProfesor.setGrado(vista.txtGrado.getText());
//        ModeloProfesor.setcargo(vista.txtCargo.getText());
//        ModeloProfesor.setSueldo(Integer.parseInt(vista.txtSueldo.getText()));
//            
            int r = ModeloProveedor.Actualizar(ModeloProfesor);
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
        vista.txtSueldo.setText("");
        vista.txtEdadd.setText("");
        vista.txtGrado.setText("");
        vista.txtCargo.setText("");
        vista.txtIdAcademia.setText("");
        vista.txtNom.requestFocus();
    }

}