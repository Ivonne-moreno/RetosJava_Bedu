public record Entrada_Record(String nombre, double precio) {
    public void mostrarInformacion (){
        System.out.println("Evento:"+ nombre + " - Precio:$" + precio);
    }
}
