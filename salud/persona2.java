package salud;

import java.util.Scanner;

public class persona2 {

    Scanner sc = new Scanner(System.in);
    public String tipoDoc, documento;
    public int edad;
    public String nombre, apellido, sexo;
    public double peso, estatura, pesoActual;

    public persona2() {
    }

    public persona2(String tipoDoc, String documento, int edad, String nombre, String apellido, String sexo,
            double peso, double estatura, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    {
        System.out.println(" BIENVENIDO AL SISTEMA DE SALUD ");
    }

    public void pedirDatos() {

        System.out.println(
                "INGRESE SU TIPO DE DOCUMENTO: CC PARA CEDULA, TI PARA TARJETA, P PARA PASAPORTE, CE PARA CEDULA DE EXTRANJERIA ");
        setTipoDoc(sc.next());
        System.out.println(" INGRESE SU NUMERO DE DOCUMENTO: ");
        setDocumento(sc.next());
        System.out.println(" INGRESE SU NOMBRE: ");
        setNombre(sc.next());
        System.out.println(" INGRESE SU APELLIDO: ");
        setApellido(sc.next());
        System.out.println(" INGRESE SU EDAD: ");
        setEdad(sc.nextInt());
        System.out.println(" INGRESE SU SEXO: ESCRIBA F PARA FEMENINO O M PARA MASCULINO:  ");
        setSexo(sc.next());
        System.out.println(" INGRESE SU PESO EN KG: ");
        setPeso(sc.nextDouble());
        System.out.println(" INGRESE SU ALTURA EN METROS: ");
        setEstatura(sc.nextDouble());
    }

    public void mostrarPersona() {
        System.out.println(" Tipo de Documento: " + getTipoDoc());
        System.out.println(" N° Documento: " + getDocumento());
        System.out.println(" Nombres y apellidos: " + getNombre() + " " + getApellido());
        System.out.println(" Edad: " + getEdad());
        System.out.println(" Sexo: " + getSexo());
        System.out.println(" Peso: " + getPeso());
        System.out.println(" Altura: " + getEstatura());

    }

    public void calcularImc() {
        setPesoActual(getPeso() / (getEstatura() * 2));

        if (getPesoActual() <= 20) {

            System.out.println(" Su peso está por debajo de lo ideal");

        } else if (getPesoActual() >= 20 && getPesoActual() <= 25) {

            System.out.println(" Su peso es ideal ");

        }

        else if (getPesoActual() > 25) {

            System.out.println(" Usted tiene sobrepeso ");

        }
    }

    public void mayorEdad() {

        if (getEdad() < 18) {

            System.out.println(" Usted es menor de edad");
        } else if (getEdad() >= 18) {

            System.out.println(" Usted es mayor de edad");

        }
    }

}
