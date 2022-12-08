package principal;

import salud.empleado;

public class inicio2 {
    
    public static void main(String[] args) {
        
        empleado emp = new empleado();
        
        emp.pedirDatos();
        emp.pedirDatos2();
        emp.calcularHonorarios();
        emp.mostrarEmpleado();

    }
}
