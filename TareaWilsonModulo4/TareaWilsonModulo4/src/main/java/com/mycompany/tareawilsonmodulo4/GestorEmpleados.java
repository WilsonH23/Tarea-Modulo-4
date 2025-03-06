
package com.mycompany.tareawilsonmodulo4;
import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<TareaWilsonModulo4> listaEmpleados;

    public GestorEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(TareaWilsonModulo4 empleado) {
        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados");
        } else {
            for (TareaWilsonModulo4 e : listaEmpleados) {
                e.mostrarInformacion();
            }
        }
    }
}
