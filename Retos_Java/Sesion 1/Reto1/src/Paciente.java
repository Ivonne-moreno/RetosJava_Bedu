package hospital;

public class Paciente {
    String nombre;
    int edad;
    String expediente;

    public void mostrarInformacion(){
        System.out.println("Información del paciente:");
        System.out.println("Paciente:"+nombre);
        System.out.println("Edad:"+edad);
        System.out.println("Número de expediente:"+expediente);
    }
}