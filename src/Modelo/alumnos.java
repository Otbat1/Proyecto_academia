
package Modelo;

/**
 *
 * @author leona
 */
public class alumnos {
    
    public int getId(){
        return id;
    }
    
    public void setid(int id){
        this.id =id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getFechaNa(){
        return fechaNa;
    }
    
    public void setFechaNa(String fechaNa){
        this.fechaNa = fechaNa;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getGrado(){
        return grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public int getMensualidad(){
        return mensualidad;
    }
    
    public void setMensualidad(int mensualidad){
        this.mensualidad = mensualidad;
    }
    
    public int getIdacademia() {
        return idacademia;
    }

    public void setIdacademia(int idacademia) {
        this.idacademia = idacademia;
    }
    private int id; 
    private String nombre;
    private String apellido;
    private String fechaNa;
    private int edad;
    private String fechaIngreso;
    private String grado;
    private int mensualidad;
    private int idacademia;

}
