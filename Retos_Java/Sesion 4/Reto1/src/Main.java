public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("BHC005", "Paola Gonzales", 1350.00);
        Factura f2 = new Factura("BHC005", "Comercial DH2", 1350.00);


        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}

