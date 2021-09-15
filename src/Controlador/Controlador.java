package Controlador;

import Modelo.AlumnoProveedor;
import Modelo.ProfesorProveedor;
import Modelo.alumnos;
import Modelo.profesor;
import Vista.Menu;
import Vista.vista;
import Vista.vistaProfe;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author edson
 */
public class Controlador implements ActionListener {

    private Menu vistaMenu;

    public Controlador(Menu vistaMenu) {

        this.vistaMenu = vistaMenu;

        this.vistaMenu.RegistrarAlumnos.addActionListener(this);
        this.vistaMenu.RegistrarProfesores.addActionListener(this);
    }

    public void Iniciar() {
        this.vistaMenu.setTitle("Menu");
        this.vistaMenu.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaMenu.RegistrarAlumnos) {

            vista V = new vista();
            alumnos alumnos = new alumnos();
            AlumnoProveedor alumnoproveedor = new AlumnoProveedor();
            ControladorAlumnos c = new ControladorAlumnos(V, alumnos, alumnoproveedor);

            c.iniciar();
            V.setVisible(true);
            //V.setLocationRelativeTo(V);
            vistaMenu.setVisible(false);

        } else if (e.getSource() == vistaMenu.RegistrarProfesores) {

            profesor modelo = new profesor();
            ProfesorProveedor proveedor = new ProfesorProveedor();
            vistaProfe vista = new vistaProfe();
            ControladorProfesor controlador = new ControladorProfesor(vista, modelo, proveedor);

            controlador.iniciar();
            vista.setVisible(true);
            //vista.setLocationRelativeTo(vista);
            vistaMenu.setVisible(false);
            
        }

    }

}
