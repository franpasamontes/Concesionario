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

public class Exposicion implements Serializable{

    private int numero;
    private String direccion;
    private long telefono;
    private ArrayList<CocheConcesionario> cochesExpo;

    public Exposicion(int numero, String direccion, long telefono){
        this.numero = numero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cochesExpo = new ArrayList<CocheConcesionario>();
    }
    
    public Exposicion(){
        this(0,null,0);
    }

    public Exposicion(Exposicion e){
        this(e.getNumero(),e.getDireccion(),e.getTelefono());
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public void aniadirCoche (CocheConcesionario c){
        this.cochesExpo.add(c);
    }

    public ArrayList<CocheConcesionario> getCochesExpo() {
        return cochesExpo;
    }

    public void setCochesExpo(ArrayList<CocheConcesionario> cochesExpo) {
        this.cochesExpo = cochesExpo;
    }
    
    
}
