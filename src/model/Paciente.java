package src.model;

public class Paciente{
    /*Atributos */
    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    /*RELACIONES */
    /*METODOS */

    public Paciente(String nombre, String apellido, int edad, int id ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.id=id;
    }

    
    public int valorTotal(){
      
        return CentroMedico.VALOR_BASE;
    } 
    /*GETTERS Y SETTERS */



    
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

 
    public int getEdad() {
        return edad;
    }

   
    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }


   
}
