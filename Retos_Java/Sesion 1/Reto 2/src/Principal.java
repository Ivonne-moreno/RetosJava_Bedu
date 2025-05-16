public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Producto utilizando el constructor
        Entrada evento1 = new Entrada("Obra de teatro", 450.0);
        Entrada evento2 = new Entrada("Concierto Bedu", 800.0);

        // Llamar al método para mostrar la información del producto
        evento1.mostrarInformacion();
        evento2.mostrarInformacion();

        //Reto adicional
        Entrada_Record entrada3= new Entrada_Record("Sinfonico de Bedu", 1200.0);
        entrada3.mostrarInformacion();
    }
}

