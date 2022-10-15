package src.model;
public class Particulaores extends Paciente {
    
    /*ATRIBUTOS */
    private int telefono;

    /*RELACION */
    private Medico medico;
    public Particulaores(int telefono,String nombre, String apellido, int edad, int id){
        super(nombre,  apellido,  edad,  id );
        this.telefono=telefono;
        this.medico= medico;
    }

    public int valorTotal(){
        return  (super.valorTotal()*10)/100;
    }
    
    public int getTelefono() {
        return telefono;
    }

  
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    /**
     * @return Medico return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
