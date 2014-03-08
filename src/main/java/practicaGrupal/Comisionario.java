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


public class Comisionario extends Persona implements Serializable{
    private ArrayList<CocheConcesionario> coches;
    
    public Comisionario(String nom, String dni, String dir, long tlf){
        super(nom,dni,dir,tlf);
        coches = new ArrayList<CocheConcesionario>();
    }
    public Comisionario(){
        super(null,null,null,0);
        coches = new ArrayList<CocheConcesionario>();
    }
    
    public Comisionario(Comisionario c){
        this(c.getNombre(),c.getDni(),c.getDireccion(),c.getTelefono());
    }
    
    public void venderCoche (CocheConcesionario c){
        this.coches.add(c);
        c.ponerVendido();
    }

    public ArrayList<CocheConcesionario> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<CocheConcesionario> coches) {
        this.coches = coches;
    }
    
}
