package src.model;
public class PacientesPrepagada extends Paciente{

    /*ATRIBUTOS */
    /*private int numAfiliacion;*/
    private int afiliacion;
    private String nombreEntidad;
    
    /*RELACIONES */
    private Nivel nivel;


    /*METODOS */
    
    public PacientesPrepagada( int afiliacion,String nombreEntidad,String nombre, String apellido, int edad, int id){
        super(nombre,  apellido,  edad,  id);
        /*this.numAfiliacion= numAfiliacion;*/
        this.afiliacion= afiliacion;
        this.nombreEntidad= nombreEntidad;

        switch(afiliacion){
            case 1:
            nivel = Nivel.ALTO;
            break;

            case 2:
            nivel = Nivel.MEDIO;
            break;

            case 3:
            nivel = Nivel.BAJO;
            break;
        }
    } 


    public double valorTotal(Nivel nivel){
        double valor=0;
        double valorTotal;

        valor =super.valorTotal();

        if(nivel == nivel.ALTO){
            valorTotal = 0;
        }
        else if(nivel==nivel.MEDIO){
            valorTotal = valor *0.30;
        }
        else{
            valorTotal = valor*0.75;
        }
        return valorTotal;
    }

/*
    public int getNumAfiliacion() {
        return numAfiliacion;
    }
 */
   /* 
    public void setNumAfiliacion(int numAfiliacion) {
        this.numAfiliacion = numAfiliacion;
    }
*/
   
    public int getAfiliacion() {
        return afiliacion;
    }

    
    public void setAfiliacion(int afiliacion) {
        this.afiliacion = afiliacion;
    }

  
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    
    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }


 
    public Nivel getNivel() {
        return nivel;
    }

  
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

}