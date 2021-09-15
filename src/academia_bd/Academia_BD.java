/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package academia_bd;

import Controlador.Controlador;
import Controlador.ControladorAlumnos;
import Controlador.ControladorProfesor;
import Modelo.AlumnoProveedor;
import Modelo.ProfesorProveedor;
import Modelo.alumnos;
import Modelo.profesor;
import Vista.Menu;

import Vista.vistaProfe;
import Vista.vista;

/**
 *
 * @author Erika dlv
 */
public class Academia_BD {

    public static void main(String[] args) {

//        AlumnoProveedor alumnop = new AlumnoProveedor();
//        ArrayList<alumnos>lstAlumnos = alumnop.ObtenerAlumnos();
        Menu V = new Menu();
        Controlador c = new Controlador(V);
        c.Iniciar();
        V.setVisible(true);

        // V.setLocationRelativeTo(null);  
    }

}
