public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Luis Mendoza", "H543456");


        Vuelo vuelo = new Vuelo("AB123", "London", "21:30");


        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }


        System.out.println(vuelo.obtenerItinerario());


        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());


        vuelo.reservarAsiento("Ivonne Moreno", "H5842654");
        System.out.println(vuelo.obtenerItinerario());
    }
}
