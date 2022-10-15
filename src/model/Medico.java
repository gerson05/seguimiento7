package src.model;

public class Medico {
    private String nombre;
    private int telefono;
    private int licencia;

    public Medico(String nombre, int telefono, int licencia){
        this.nombre=nombre;
        this.telefono=telefono;
        this.licencia=licencia;
    }

    

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getTelefono() {
        return telefono;
    }

    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   
    public int getLicencia() {
        return licencia;
    }

   
    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

}
