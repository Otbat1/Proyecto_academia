package Modelo;

/**
 *
 * @author leona
 */
public class profesor {

    public int getId(){
        return id;
    }
    
    public void setId(int id){
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
    public int getIdacademia(){
        return idAcademia;
    }
    
    public void setIdacademia(int idAcademia){
        this.idAcademia = idAcademia;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public String getGrado(){
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargo(String cargo){
        this.cargo = cargo;
    }
    
    private int id; 
    private String nombre;
    private String apellido;
    private int idAcademia;
    private int edad;
    private int sueldo;
    private String grado;
    private String cargo;
}
