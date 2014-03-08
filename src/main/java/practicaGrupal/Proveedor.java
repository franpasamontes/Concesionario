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
import java.util.ArrayList;
import java.util.Iterator;


public class Proveedor implements Serializable{
    private String nombre;
    private String direccion;
    private int codigo;
    private String tipoCoche;
    private ArrayList<Coche> coches; 
    
    public Proveedor(String nombre, String direccion, int codigo, String tipoCoche){
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigo = codigo;
        this.tipoCoche = tipoCoche;
        this.coches = new ArrayList<Coche>();
    }
    public Proveedor(){
        this(null,null,0,null);
    }        
    public Proveedor(Proveedor p){
        this(p.getNombre(),p.getDireccion(),p.getCodigo(),p.getTipoCoche());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }
    public void aniadirCoche(Coche c){
        this.coches.add(c);
    }
    public String mostrarCoches(){
        Iterator<Coche> it = this.coches.iterator();
        String todo = new String();

        while (it.hasNext()) {
            todo = new String(todo + "\n" + it.next().toString());
        }
        return todo;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
    
    
}
