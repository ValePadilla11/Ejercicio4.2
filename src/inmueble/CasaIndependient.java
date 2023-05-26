
package inmueble;
public class CasaIndependient extends CasaUrbana {
    protected static double valorArea=3000000;

    public CasaIndependient(int identificarInmobiliario, int Area, String direccion, int numerohabitaciones, int numerobaños, int numeroPisos) {
        super(identificarInmobiliario, Area, direccion, numerohabitaciones, numerobaños, numeroPisos);
    }


    @Override
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}