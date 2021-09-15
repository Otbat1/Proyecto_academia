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

/**
 *
 * @author Ricardo
 */
public class ProfesorProveedor extends Conexion {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    profesor Prof = new profesor();
    
    
    public List listar() {
        List<profesor> datos = new ArrayList<>();
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement("{call ListadoProfesor}");
            rs = ps.executeQuery();
            while (rs.next()) {
                profesor profe = new profesor();
                profe.setId(rs.getInt(1));
                profe.setNombre(rs.getString(2));
                profe.setApellido(rs.getString(3));
                profe.setEdad(rs.getInt(4));
                profe.setSueldo(rs.getInt(5));
                profe.setGrado(rs.getString(6));
                profe.setcargo(rs.getString(7));
                profe.setIdacademia(rs.getInt(8));
                datos.add(profe);
            }
        } catch (Exception e) {System.err.println("Listar/n"+e);
        }
        return datos;
    }    
    
    public int agregar(profesor profe) {  
        int r=0;
//        String sql="INSERT INTO Profesor VALUES (?,?,?,?,?,?,?,?)";
        String sql = "{call InsertarProfesor(?,?,?,?,?,?,?,?)}";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, profe.getId());
            ps.setString(2,profe.getNombre());
            ps.setString(3, profe.getApellido());
            ps.setInt(4, profe.getEdad());
            ps.setInt(5, profe.getSueldo());
            ps.setString(6, profe.getGrado());
            ps.setString(7, profe.getcargo());            
            ps.setInt(8, profe.getIdacademia());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {System.err.println("Agregar/n"+e);
        }  
        return r;
    }
    
    public int Actualizar(profesor profe) {  
        int r=0;
//        String sql="update Profesor set Nombre=?,Apellido=?,@FechaNacimiento=?,Edad=?,FechaIngreso=?,Grado=?,Mensualidad =?,Academia_ID=? where Id=?";        
        String sql ="{call ModificarProfesor(?,?,?,?,?,?,?,?)}";
        try {
            
            CallableStatement cmstmt=con.prepareCall(sql);
            con = conectar.getConexion();
            cmstmt.setString(2,profe.getNombre());
            cmstmt.setString(3, profe.getApellido());
            cmstmt.setInt(4, profe.getIdacademia());
            cmstmt.setInt(5, profe.getEdad());
            cmstmt.setInt(6, profe.getSueldo());
            cmstmt.setString(7, profe.getGrado());
            cmstmt.setString(8, profe.getcargo());
            cmstmt.setInt(1,profe.getId());
            r=cmstmt.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {System.err.println("Acrtulizar/n"+e);
        }  
        return r;
    }
    

    public int Elimina(int id){
        int r=0;
        String sql="delete from Profesor where Id="+id;
//        String sql="{call EliminarAlumnos(?)}"+id;
        try {
            con=conectar.getConexion();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Eliminar/n"+e);
            
        }
        return r;
    } 
    
}