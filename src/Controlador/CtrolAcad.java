package Controlador;

import java.awt.event.ActionListener;
import Modelo.alumnos;
import Modelo.Conexion;
import Modelo.profesor;
import Vista.RegistroAlum;
import java.awt.event.ActionEvent;
public abstract class CtrolAcad implements ActionListener{
    private final alumnos ModeloAlumnos;
    private final RegistroAlum VistaAlumnos;
    public CtrolAcad(alumnos alumnos, RegistroAlum RegistroAlum ){
        this.ModeloAlumnos = alumnos;
        this.VistaAlumnos = RegistroAlum;
    }
    
    public void iniciar (){
        VistaAlumnos.setTitle("Crear Alumno");
        VistaAlumnos.setLocationRelativeTo(null);
    }
//    
//    public void actionPerforme(ActionEvent e){
//        ModeloAlumnos.setNombre(VistaAlumnos.txtNombreAlumnos.getText());
//        ModeloAlumnos.setApellido(VistaAlumnos.txtApellidosAlumnos.getText());
//        
//        if()
//    }
}
