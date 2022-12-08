package principal;

import salud.persona;

public class inicio {

    public static void main(String[] args) {
        
        persona per = new persona();

        per.pedirDatos();
        per.mostrarPersona();
        per.calcularImc();
        per.mayorEdad();
    }
    
}
