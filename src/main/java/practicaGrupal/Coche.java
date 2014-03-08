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
import java.io.Serializable;

public class Coche implements Serializable{
    private String marca;
    private String modelo;
    private double precioVenta;
    private String matricula;
    private String tipoVehiculo;
    
    public Coche(String marca, String modelo, double precioVenta, String matricula, String tipoVehiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public Coche(){
        this(null,null,0,null,null);
    }
    
    public Coche(Coche c){
        this(c.getMarca(),c.getModelo(),c.getPrecioVenta(),c.getMatricula(),c.getTipoVehiculo());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Marca = " + marca + "\n" +
                "Modelo = " + modelo + "\n" +
                "PrecioVenta = " + precioVenta + "\n" +
                "Matricula = " + matricula + "\n" +
                "TipoVehiculo = " + tipoVehiculo + "\n";
    }
    public String toStringCliente() {
        return "Marca = " + marca + "\n" +
                "Modelo = " + modelo + "\n" +
                "Matricula = " + matricula + "\n" +
                "TipoVehiculo = " + tipoVehiculo + "\n";
    }
    
}
