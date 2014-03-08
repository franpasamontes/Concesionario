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


public class Cliente extends Persona implements Serializable{

    private ArrayList<CocheConcesionario> cochesComprados;
    private ArrayList<CocheConcesionario> cochesReservados;

    public Cliente(String nom, String dni, String dir, long tlf) {
        super(nom, dni, dir, tlf);
        cochesComprados = new ArrayList<CocheConcesionario>();
        cochesReservados = new ArrayList<CocheConcesionario>();
    }

    public Cliente() {
        super(null, null, null, 0);
        cochesComprados = new ArrayList<CocheConcesionario>();
        cochesReservados = new ArrayList<CocheConcesionario>();
    }

    public void reservarCoche(CocheConcesionario c) {
        this.cochesReservados.add(c);
        c.reservar();
    }

    public void CancelarReserva(CocheConcesionario c) {
        if (this.HayCochesReservados() == false) {
            //Devolver, "No hay coches reservados" por pantalla ó
            //incluso hacer que no se pueda cancelarReserva ni 
            //comprarCocheReservado
        } else {
            this.cochesReservados.remove(c);
            c.ponerVenta();
        }
    }

    public void ComprarCoche(CocheConcesionario c) {
        this.cochesComprados.add(c);
        c.ponerVendido();
    }

    public void ComprarCocheReservado(CocheConcesionario c) {
        if (this.HayCochesReservados() == false) {
            //Devolver, "No hay coches reservados" por pantalla ó
            //incluso hacer que no se pueda cancelarReserva ni 
            //comprarCocheReservado
        } else {
            this.CancelarReserva(c);
            this.ComprarCoche(c);
        }
    }

    private Boolean HayCochesReservados() {
        if (this.cochesReservados.isEmpty()) {
            return false;
        }
        return true;
    }

    public ArrayList<CocheConcesionario> getCochesComprados() {
        return cochesComprados;
    }

    public void setCochesComprados(ArrayList<CocheConcesionario> cochesComprados) {
        this.cochesComprados = cochesComprados;
    }

    public ArrayList<CocheConcesionario> getCochesReservados() {
        return cochesReservados;
    }

    public void setCochesReservados(ArrayList<CocheConcesionario> cochesReservados) {
        this.cochesReservados = cochesReservados;
    }
    
    
}
