public class Principal {
    public static void main(String[] args) {

        Factura facturaConRFC = new Factura(3500.0, "Servicio de consultoría", "ABCC010101XYZ");


        Factura facturaSinRFC = new Factura(1500.0, "Reparación de equipo", null);


        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}