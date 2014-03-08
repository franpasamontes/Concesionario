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
import java.util.Iterator;

public class Concesionario {
    private ArrayList<CocheConcesionario> cochesConcesionario;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Empleado> empleados;
    private ArrayList<Exposicion> exposiciones;
    private ArrayList<Comisionario> comisionarios;
    private ArrayList<Cliente> clientes;
    private String nombre;
    public Concesionario(String nom){
        this.nombre = nom;
        this.cochesConcesionario = new ArrayList<CocheConcesionario>();
        this.proveedores = new ArrayList<Proveedor>();
        this.empleados = new ArrayList<Empleado>();
        this.exposiciones = new ArrayList<Exposicion>();
        this.comisionarios = new ArrayList<Comisionario>();
        this.clientes = new ArrayList<Cliente>();
    }
    public Concesionario(){
        this(null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String consultarCoches(){
        Iterator<CocheConcesionario> it = this.cochesConcesionario.iterator();
        String todo = new String();

        while (it.hasNext()) {
            todo = new String(todo + "\n" + it.next().toString());
        }
        return todo;
    
    }
    
    public void aniadirCocheaExpo(Exposicion exp, CocheConcesionario cC){
        exp.aniadirCoche(cC);
        this.aniadirCocheConcesionario(cC);
    }
    
    public void aniadirCocheConcesionario (CocheConcesionario cC){
        this.cochesConcesionario.add(cC);
    }
    public void ComprarCoche (Proveedor proveedor){
        
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<CocheConcesionario> getCochesConcesionario() {
        return cochesConcesionario;
    }

    public void setCochesConcesionario(ArrayList<CocheConcesionario> cochesConcesionario) {
        this.cochesConcesionario = cochesConcesionario;
    }

    public ArrayList<Comisionario> getComisionarios() {
        return comisionarios;
    }

    public void setComisionarios(ArrayList<Comisionario> comisionarios) {
        this.comisionarios = comisionarios;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Exposicion> getExposiciones() {
        return exposiciones;
    }

    public void setExposiciones(ArrayList<Exposicion> exposiciones) {
        this.exposiciones = exposiciones;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    
}
