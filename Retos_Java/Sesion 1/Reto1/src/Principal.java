package hospital;
import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            hospital.Paciente p1 = new hospital.Paciente();

            System.out.print("Ingrese el nombre del paciente:");
            p1.nombre = input.nextLine();

            System.out.print("\uD83E\uDDEE Ingrese la edad:");
            p1.edad = input.nextInt();
            input.nextLine();

            System.out.print("Ingrese el número del expediente:");
            p1.expediente = input.nextLine();

            input.close();
            p1.mostrarInformacion();
        }
    }
