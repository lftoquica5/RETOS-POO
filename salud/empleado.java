package salud;

import java.util.Scanner;

public class empleado extends persona2 {
    
    Scanner sc = new Scanner(System.in);
    public String cargo, departamento;
    public int  horastrabajadas;
    public double valorhora= 4166,totalpagar; 
    public double reteica=0.996*100;

    
    public void pedirDatos2(){

        System.out.println(" INGRESE SU CARGO: ");
        cargo=sc.next();
        System.out.println(" INGRESE SU DEPARTAMENTO: ");
        departamento=sc.next();
        System.out.println(" INGRESE SUS HORAS TRABAJADAS: ");
        horastrabajadas=sc.nextInt();
    }

    public void calcularHonorarios(){

        totalpagar=(valorhora*horastrabajadas)-reteica;
    }
    public void mostrarEmpleado(){
        System.out.println(" Tipo de Documento: " +getTipoDoc());
        System.out.println(" N° Documento: " +getDocumento());
        System.out.println(" Nombres y apellidos: " +getNombre() +" " +getApellido());
        System.out.println(" Cargo: " +cargo);
        System.out.println(" Horas trabajadas: " +horastrabajadas);
        System.out.println(" Valor x hora: " +valorhora);
        System.out.println(" Total a pagar: " +totalpagar);
    }

    
}

