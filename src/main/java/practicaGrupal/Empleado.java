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


public class Empleado extends Persona implements Serializable{

    private double salario;
    private String tipoEmpleado;

    public Empleado(String nom, String dni, String dir, long tlf, double salario, String tipoEmpleado) {
        super(nom, dni, dir, tlf);
        this.salario = (salario > 0) ? salario : 0;

        if ((tipoEmpleado.equalsIgnoreCase("Director")) || (tipoEmpleado.equalsIgnoreCase("Mecanico"))) {
            this.tipoEmpleado = tipoEmpleado;
        } else {
            this.tipoEmpleado = "Vendedor";
        }
    }

    public Empleado(String nom, String dni, String dir, long tlf) {
        super(nom, dni, dir, tlf);
        this.salario = 0;
        this.tipoEmpleado = "Vendedor";
    }

    public Empleado() {
        super();
        this.salario = 0;
        this.tipoEmpleado = "Vendedor";
    }
    
    public Empleado(Empleado e){
        this(e.getNombre(),e.getDni(),
                e.getDireccion(),e.getTelefono(),
                e.getSalario(),e.getTipoEmpleado());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}
