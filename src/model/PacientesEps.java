package src.model;
public class PacientesEps extends Paciente {
    
    /*ATRIBUTOS */
    private String nameEps;
    private int ordenServicio;

    public PacientesEps(String nameEps, int ordenServicio,String nombre, String apellido, int edad, int id){
        super(nombre,  apellido,  edad,  id);
        this.nameEps= nameEps;
        this.ordenServicio=ordenServicio;

    }

    public double valorTotal(int ordenServicio){
        double valor =valorTotal() ;
        double totalPagar;

        if(ordenServicio==1){
        totalPagar =0;
        
        }else{
            totalPagar = valor *0.20;
        }
        return totalPagar;
    }
    

    public String getNameEps() {
        return nameEps;
    }

   
    public void setNameEps(String nameEps) {
        this.nameEps = nameEps;
    }

    
    public int getOrdenServicio() {
        return ordenServicio;
    }

   
    public void setOrdenServicio(int ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

}
