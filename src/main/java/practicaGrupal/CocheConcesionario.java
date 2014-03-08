/****************************************
 * NOMBRE: Adrián Sanz Contreras        *
 * DNI: 49097240-Z                      *
 * Nº EXP: 145                          *
 *                                      *
 * NOMBRE: Alfonso Santamaría Rodríguez *
 * DNI: 49095131-K                      *   
 * Nº EXP: 63                           *
 *                                      *
 * NOMBRE: Fco Javier Pasamontes Moreno *
 * DNI: 47516684-H                      *
 * Nº EXP: 153                          *
 *                                      *
 * 2º GRADO EN INGERNIERÍA DEL SOFTWARE *
 * CURSO: 2011-2012                     *
 ****************************************/
package practicaGrupal;
import java.util.ArrayList;
import java.io.Serializable;

public class CocheConcesionario extends Coche implements Serializable{
    private double precioCompra;
    private String estado;
    private ArrayList<Reparacion> reparaciones;
    
    public CocheConcesionario(String marca, String modelo, double precioVenta, String matricula, String tipoVehiculo,
            float precioCompra, String estado){
        super(marca, modelo, precioVenta, matricula, tipoVehiculo);
        this.precioCompra = precioCompra;
        this.estado = estado;
        reparaciones = new ArrayList<Reparacion>();
    }
    
    public CocheConcesionario(){
        super(null,null,0,null,null);
        this.precioCompra = 0;
        this.estado = null;
        reparaciones = new ArrayList<Reparacion>();
   }
    
    public CocheConcesionario(CocheConcesionario cC){
        super(cC.getMarca(),cC.getModelo(),cC.getPrecioVenta(),cC.getMatricula(),cC.getTipoVehiculo());
        this.precioCompra = cC.getPrecioCompra();
        this.estado = cC.getEstado();
        reparaciones = new ArrayList<Reparacion>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    public void ponerReparacion(){
        this.setEstado("Reparacion");
    }
    public void ponerVenta(){
        this.setEstado("En venta");
    }
    public void reservar(){
        this.setEstado("Reservado");
    }
    public void ponerVendido(){
        this.setEstado("Vendido");
    }
    public void cambiarExposicion(){
        
    }
    public void reparar(Reparacion rep){
        this.reparaciones.add(rep);
        if(this.getPrecioCompra()==0.d){
            this.setEstado("");
        }else{
        this.ponerVenta();
        }
    }

    @Override
    public String toString() {
        return  super.toString() + "Precio compra = " + precioCompra + "\n" +
                "Estado = " + estado +  "\n";
    }
    @Override
    public String toStringCliente() {
        return  super.toStringCliente() + "Precio compra = " + precioCompra + "\n" +
                "Estado = " + estado +  "\n";
    }
    
}
