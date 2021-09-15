/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class AlumnoProveedor extends Conexion {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    alumnos alumno = new alumnos();
    
    
    public List listar() {
        List<alumnos> datos = new ArrayList<>();
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement("{call ListadoAlumnos}");
            rs = ps.executeQuery();
            while (rs.next()) {
                alumnos alumno = new alumnos();
                alumno.setid(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setApellido(rs.getString(3));
                alumno.setFechaNa(rs.getString(4));
                alumno.setEdad(rs.getInt(5));
                alumno.setFechaIngreso(rs.getString(6));
                alumno.setGrado(rs.getString(7));
                alumno.setMensualidad(rs.getInt(8));
                alumno.setIdacademia(rs.getInt(9));
                datos.add(alumno);
            }
        } catch (Exception e) {System.err.println("Puto"+e);
        }
        return datos;
    }    
    
    public int agregar(alumnos alumno) {  
        int r=0;
        String sql="{call InsertarAlumnos(?,?,?,?,?,?,?,?,?)}";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getId());
            ps.setString(2,alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setString(4, alumno.getFechaNa());
            ps.setInt(5, alumno.getEdad());
            ps.setString(6, alumno.getFechaIngreso());
            ps.setString(7, alumno.getGrado());
            ps.setInt(8, alumno.getMensualidad());
            ps.setInt(9, alumno.getIdacademia());            

            
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {System.err.println("Puto"+e);
        }  
        return r;
    }
    
    public int Actualizar(alumnos alumno) {  
        int r=0;
//        String sql="update Alumnos set Nombre=?,Apellido=?,FechaNacimiento=?,Edad=?,FechaIngreso=?,Grado=?,Mensualidad =?,Academia_ID=? where Id=?"; 
        String sql="{call ModificarAlumnos(?,?,?,?,?,?,?,?,?)}";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);   
            ps.setInt(1,alumno.getId());
            ps.setString(2,alumno.getNombre());
            ps.setString(3,alumno.getApellido());
            ps.setString(4, alumno.getFechaNa());
            ps.setInt(5, alumno.getEdad());
            ps.setString(6,alumno.getFechaIngreso());
            ps.setString(7,alumno.getGrado());
            ps.setInt(8,alumno.getMensualidad());
            ps.setInt(9,alumno.getIdacademia());
            
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {System.err.println("Puto"+e);
        }  
        return r;
    }
    
    public int Elimina(int id){
        int r=0;
        String sql="delete from Alumnos where Id="+id;
//        String sql="{call EliminarAlumnos(?)}"+id;
        try {
            con=conectar.getConexion();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Puto"+e);
        }
        return r;
    }   
}