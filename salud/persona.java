package salud;

import java.util.Scanner;

public class persona {

    Scanner sc = new Scanner(System.in);
    public String tipoDoc, documento;
    public int  edad;
    public String nombre,apellido, sexo;
    public double peso, estatura, pesoActual;

    {System.out.println(" BIENVENIDO AL SISTEMA DE SALUD ");}
    
    public void pedirDatos(){
        
        System.out.println("INGRESE SU TIPO DE DOCUMENTO: CC PARA CEDULA, TI PARA TARJETA, P PARA PASAPORTE, CE PARA CEDULA DE EXTRANJERIA ");
		tipoDoc=sc.next(); 
        System.out.println(" INGRESE SU NUMERO DE DOCUMENTO: ");
        documento=sc.next();
        System.out.println(" INGRESE SU NOMBRE: ");
        nombre=sc.next();
        System.out.println(" INGRESE SU APELLIDO: ");
        apellido=sc.next();
        System.out.println(" INGRESE SU EDAD: ");
        edad=sc.nextInt();
        System.out.println(" INGRESE SU SEXO: ESCRIBA F PARA FEMENINO O M PARA MASCULINO:  ");
        sexo=sc.next();
        System.out.println(" INGRESE SU PESO EN KG: ");
        peso=sc.nextDouble(); 
        System.out.println(" INGRESE SU ALTURA EN METROS: ");
        estatura=sc.nextDouble();   
    }

    public void mostrarPersona(){
        System.out.println(" Tipo de Documento: " +tipoDoc);
        System.out.println(" N° Documento: " +documento);
        System.out.println(" Nombres y apellidos: " +nombre +" " +apellido);
        System.out.println(" Edad: " +edad);
        System.out.println(" Sexo: " +sexo);
        System.out.println(" Peso: " +peso);
        System.out.println(" Altura: " +estatura);

    }

    // public void calcularImc(){
    //     pesoActual=peso/(estatura*2);
        

    //     if(pesoActual<=20){

    //         System.out.println(" Su peso está por debajo de lo ideal");

            
    //     }
    //     else if(pesoActual >=20 && pesoActual<=25) {

    //             System.out.println(" Su peso es ideal ");
            
    //         }
            
    //         else if(pesoActual>25) {
            
    //             System.out.println(" Usted tiene sobrepeso ");

    //         }
    // }

    public String calcularImc(){

        String calc = " ";
        pesoActual=peso/(estatura*2);
        

        if(pesoActual<=20){

            calc=" peso bajo";

            
        }
        else if(pesoActual >=20 && pesoActual<=25) {

            calc=" peso ideal";
            
            }
            
            else if(pesoActual>=25) {
            
                calc=" Sobrepeso";

            }
            
            System.out.println(calc);
            return calc;
    }

    public void mayorEdad(){

        if(edad<18){

            System.out.println(" Usted es menor de edad");
        }
        else if(edad>=18) {

                System.out.println(" Usted es mayor de edad");
            
            }
    }

    
}
